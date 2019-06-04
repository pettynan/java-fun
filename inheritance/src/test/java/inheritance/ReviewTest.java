package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    private String lorem = "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"";
    private Review testReview = new Review(lorem, "ipsum", 1);

    @Test
    public void testReview() {


        assertTrue("The constructed testReview Review should contain the inputs given to the constructor.",
                testReview.body.equals(lorem) && testReview.author.equals("ipsum") && testReview.stars == 1);
    }

    @Test
    public void testReview_toString() {

        String expectedString = "Review by ipsum: 1 out of 5 stars.\n" +
                "Review body:\n" +
                lorem;
        String outputString = Review.toString(testReview);

        assertEquals("The method should return the above string.",
                expectedString,
                outputString
        );
        System.out.println(outputString);
    }
}