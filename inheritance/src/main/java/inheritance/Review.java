package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    Business business;

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

    public static String toString(Review review) {
        String outputString =
        "Review by " + review.author + ": " + review.stars + " out of 5 stars.\n" +
                "Review body:\n" +
                review.body;

        return outputString;
    }
}
