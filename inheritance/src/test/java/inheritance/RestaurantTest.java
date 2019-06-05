package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    private Restaurant testaurant;
    private String lorem = "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"";
    private Review newReview = new Review(lorem, "ipsum", 4);
    private Review newReview2 = new Review(lorem, "ipsum", 2);

    @Before
    public void initializeShop() {
        testaurant = new Restaurant("Canalis", 2);
        testaurant.addReview(newReview);
        testaurant.addReview(newReview2);

    }


    @Test
    public void testRestaurant_getName() {

        assertSame("The getName method should return the name \"Canalis\".", "Canalis", testaurant.getName());
    }

    @Test
    public void testRestaurant_getStars() {
        testaurant.addReview(newReview);
        testaurant.addReview(newReview2);

        assertEquals("The getStars method should return 3, the average of 2 and 4.", 3, testaurant.getStars());
    }

    @Test
    public void testRestaurant_getPrice() {

        assertEquals("The getPrice method should return the constructed price of 2.", 2, testaurant.getPrice());
    }

    @Test
    public void testRestaurant_toString() {

        String expectedString = "The restaurant Canalis has 3 out of 5 stars and a price rating of $$.";
        String outputString = testaurant.toString(testaurant);

        assertEquals("The method should return the above string.",
                expectedString,
                outputString
        );
    }

    @Test
    public void testRestaurant_addReview() {

        testaurant.addReview(newReview);

        assertEquals("The new review should have the testaurant restaurant class as its restaurant.",
                testaurant,
                newReview.business);

    }

    @Test
    public void testRestaurant_addReviewStars() {
        // the total stars begins at 6.
        testaurant.addReview(newReview);
        // the total stars should now equal 10.

        assertEquals("The rating of the restaurant should have changed from its original value of 4.",
                10,
                testaurant.totalStars);
    }
}