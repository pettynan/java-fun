package inheritance;

import java.util.ArrayList;

public class Shop implements Business {

    private String name;
    private String description;
    private int totalStars;
    private int price;
    private ArrayList<Review> reviewList = new ArrayList<>();

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
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
    public String getName() {
        return this.name;
    }

    @Override
    public int getStars() {
        return (this.totalStars / reviewList.size()
        );
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public ArrayList<Review> getReviewList() {
        return this.reviewList;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public void addReview(Review review) {
    this.totalStars += review.stars;
    review.business = this;
    reviewList.add(review);
    }

    public String toString(Shop shop) {
        StringBuilder outputString = new StringBuilder("Shop name: " + shop.name + "\nRating: " + shop.getStars() + " out of 5 stars and a price rating of ");

        for ( int i = 0 ; i < shop.price ; i++) {
            outputString.append("$");
        }
        outputString.append(".\n");
        outputString.append("Description: ");
        outputString.append(shop.description);
        return outputString.toString();
    }
}
