package inheritance;

import java.util.ArrayList;

public class Theater implements Business {

    private String name;
    private int totalStars;
    private int price;
    private ArrayList<Review> reviewList = new ArrayList<>();
    private ArrayList<String> movieList = new ArrayList<>();

    public Theater(String name, int price) {
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

    @Override
    public void addReview(Review review) {
        this.totalStars += review.stars;
        review.business = this;
        reviewList.add(review);
    }

    public ArrayList<String> getMovieList() {
        return this.movieList;
    }

    public void addMovie(String movie) {
        movieList.add(movie);
    }

    public void removeMovie(String movie) {
        for (int i = 0 ; i < movieList.size() ; i++) {
            if (movieList.get(i) == movie) {
                movieList.remove(i);
                return;
            }
        }
        System.out.print("Movie " + movie + " was not found in movieList!");
    }

    public String toString(Theater theater) {
        StringBuilder outputString = new StringBuilder("Theater name: " + theater.name + "\nRating: " + theater.getStars() + " out of 5 stars and a price rating of ");

        for ( int i = 0 ; i < theater.price ; i++) {
            outputString.append("$");
        }
        outputString.append(".\n");

        if (movieList.size() == 0) {
            outputString.append("No movies currently playing.");
        } else {
            outputString.append("Currently playing movies are:");
            for (int i = 0 ; i < movieList.size() ; i++) {
                outputString.append("\n" +
                        movieList.get(i) + ",");
            }
        }

        return outputString.toString();
    }
}
