package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    private Theater testTheater;
    private Review newReview = new Review("body text here", "ipsum", 4);

    @Before
    public void initTheater() {
        testTheater = new Theater("Majestic Bay", 2);
    }

    @Test
    public void getName() {

        assertEquals("The getName method should return the string 'Majestic Bay'.",
                "Majestic Bay",
                testTheater.getName());
    }

    @Test
    public void addGetReview() {
        testTheater.addReview(newReview);

        assertEquals("You should be able to reference the review newReview via testTheater.",
                newReview,
                testTheater.getReviewList().get(0));
    }



    @Test
    public void addMovie() {
        testTheater.addMovie("Avengers Endgame");

        assertEquals("The movie list should contain the string 'Avengers Endgame'.",
                "Avengers Endgame",
                testTheater.getMovieList().get(0));
    }

    @Test
    public void removeMovie() {
        testTheater.addMovie("Avengers Endgame");
        testTheater.addMovie("The Dark Knight");
        testTheater.addMovie("Paprika");
        testTheater.addMovie("Us");
        testTheater.removeMovie("Paprika");

        assertEquals("The size of the movie list should be 3",
                3,
                testTheater.getMovieList().size());

    }

    @Test
    public void theater_toString() {
        testTheater.addMovie("Avengers Endgame");
        testTheater.addMovie("The Dark Knight");
        testTheater.addMovie("Paprika");
        testTheater.addMovie("Us");

        String expectedString = "Theater name: Majestic Bay\n" +
                "Rating: 5 out of 5 stars and a price rating of $$.\n" +
                "Currently playing movies are:\n" +
                "Avengers Endgame\n" +
                "The Dark Knight\n" +
                "Paprika\n" +
                "Us";

        assertEquals("The method .toString should return the string shown above.",
                expectedString,
                testTheater.toString(testTheater));
    }
}