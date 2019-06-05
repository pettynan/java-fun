package inheritance;

import java.util.ArrayList;

public class Restaurant implements Business {

    String name; // should be a string.
    int totalStars; // should be an integer between 0 and 5.
    int price; // should be 1, 2, or 3.
    ArrayList<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, int price) {
        this.name = name;
        this.totalStars = 0;

        if (price > 3) {
            this.price = 3;
        } else if (price < 1) {
            this.price = 1;
        } else {
            this.price = price;
        }
    }

    @Override
    public void addReview(Review review) {
        review.business = this;
        this.totalStars += review.stars;
        reviewList.add(review);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStars() {
        if (reviewList.size() == 0) {
            return 5;
        } else {
            return (this.totalStars / reviewList.size());
        }
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Review> getReviewList() {
        return this.reviewList;
    }

    public String toString(Restaurant restaurant) {
        StringBuilder outputString = new StringBuilder("The restaurant " + restaurant.name + " has " + (restaurant.totalStars / getReviewList().size()) + " out of 5 stars and a price rating of ");

        for ( int i = 0 ; i < restaurant.price ; i++) {
            outputString.append("$");
        }
        outputString.append(".");
        return outputString.toString();
    }
}
