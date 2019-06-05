package inheritance;

import java.util.ArrayList;

public interface Business {
    String getName();
    int getStars();
    int getPrice();
    ArrayList<Review> getReviewList();
    void addReview(Review review);
}