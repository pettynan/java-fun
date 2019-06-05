package inheritance;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ShopTest {

    private Shop testShop;
    private Review newReview = new Review("body text here", "ipsum", 4);

    @Before
    public void initializeShop() {
        testShop = new Shop("Pat's Salmon Cakes", "Delicious salmon cakey bits", 1);
        testShop.addReview(newReview);

    }

    @Test
    public void test_getName() {


        assertEquals("The getName method should return the string 'Pat's Salmon Cakes'.",
                "Pat's Salmon Cakes",
                testShop.getName());
    }

    @Test
    public void getStars() {
        // Same as RestaurantTest .getStars
    }

    @Test
    public void getPrice() {
        // Same as RestaurantTest .getPrice
    }

    @Test
    public void addGetReview() {
        assertEquals("You should be able to reference the review newReview via testShop.",
                newReview,
                testShop.getReviewList().get(0));
    }

    @Test
    public void test_getDescription() {

        assertEquals("The getDescription method should return the string \"Delicious salmon cakey bits\"",
                "Delicious salmon cakey bits",
                testShop.getDescription());
    }

    @Test
    public void shop_toString() {
        System.out.println(testShop.toString(testShop));
    }
}