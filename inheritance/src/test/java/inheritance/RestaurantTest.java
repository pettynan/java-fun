package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    private Restaurant testaurant = new Restaurant("Canalis", 4, 2);
    private String lorem = "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"";
    private Review newReview = new Review(lorem, "ipsum", 1);


    @Test
    public void testRestaurant() {

         assertTrue("The constructed testaurant Restaurant should contain the inputs given to the constructor",
                 testaurant.name.equals("Canalis") && testaurant.stars == 4 && testaurant.price == 2);
    }

    @Test
    public void testRestaurant_toString() {

        String expectedString = "The restaurant Canalis has 4 out of 5 stars and a price rating of $$.";
        String outputString = Restaurant.toString(testaurant);

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
                newReview.restaurant);

    }

    @Test
    public void testRestaurant_addReviewStars() {
        // the stars begin at 4.
        testaurant.addReview(newReview);
        //the stars should now be 2.

        assertNotEquals("The rating of the restaurant should have changed from its original value of 4.",
                4,
                testaurant.stars);
    }
}