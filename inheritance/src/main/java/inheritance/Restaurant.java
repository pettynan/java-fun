package inheritance;

public class Restaurant {

    String name; // should be a string.
    int stars; // should be an integer between 0 and 5.
    int price; // should be 1, 2, or 3.

    public Restaurant(String name, int stars, int price) {
        this.name = name;

        if (stars > 5) {
            this.stars = 5;
        } else if (stars < 0) {
            this.stars = 0;
        } else {
            this.stars = stars;
        }

        if (price > 3) {
            this.price = 3;
        } else if (price < 1) {
            this.price = 1;
        } else {
            this.price = price;
        }
    }

    public static String toString(Restaurant restaurant) {
        String outputString = "The restaurant " + restaurant.name + " has " + restaurant.stars + " out of 5 stars and a price rating of ";

        for ( int i = 0 ; i < restaurant.price ; i++) {
            outputString += "$";
        }
        outputString += ".";
        return outputString;
    }

    public void addReview(Review review) {
        review.restaurant = this;
        this.stars = (this.stars + review.stars) / 2;
    }
}
