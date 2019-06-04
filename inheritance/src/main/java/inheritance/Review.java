package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    Restaurant restaurant;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;

        if (stars > 5) {
            this.stars = 5;
        } else if (stars < 0) {
            this.stars = 0;
        } else {
            this.stars = stars;
        }
    }

//    public void addRestaurant(Restaurant restaurant) {
//        this.restaurant = restaurant;
//    }

    public static String toString(Review review) {
        String outputString = "Restaurant:" + review.restaurant +
        "Review by " + review.author + ": " + review.stars + " out of 5 stars.\n" +
                "Review body:\n" +
                review.body;

        return outputString;
    }
}
