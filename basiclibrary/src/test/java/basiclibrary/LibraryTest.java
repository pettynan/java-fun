/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testRoll_range() {
        Library rollForTesting = new Library();

        int[] result = rollForTesting.roll(6);

        assertTrue("The first value of the array should equal an integer between 1 and 6.",
                (result[0] == 1 || result[0] == 2 ||result[0] == 3 ||result[0] == 4 ||result[0] == 5 ||result[0] == 6)
        );
    }

    @Test
    public void testRoll_length() {
        Library rollForTesting = new Library();

        int[] result = rollForTesting.roll(6);

        assertTrue("The returned array should have a length equal to the input n.",
                (result.length == 6)
        );
    }

    @Test
    public void testContainsDuplicates_true() {
        Library containsDuplicatesForTesting = new Library();

        boolean result = containsDuplicatesForTesting.containsDuplicates(new int[] {1, 2, 3, 4, 5, 6, 1});

        assertTrue("The function should return true when there is a duplicate.",
                result
        );
    }

    @Test
    public void testContainsDuplicates_false() {
        Library containsDuplicatesForTesting = new Library();

        boolean result = containsDuplicatesForTesting.containsDuplicates(new int[] {1, 2, 3, 4, 5, 6, 7});

        assertFalse("The function should return false when there are no duplicates.",
                result
        );
    }

    @Test
    public void testCalculateAverage_value() {
        Library calculateAverageForTesting = new Library();

        int[] testArray = new int[] {3, 2, 1, 5};

        assertEquals("The function should return the average of the array, with a margin of error of 0.001.",
                (float) 2.75,
                calculateAverageForTesting.calculateAverage(testArray),
                0.001
        );
    }

    @Test
    public void testLowestAverage_value() {
        Library lowestAverageForTesting = new Library();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        assertEquals("The function should return the array with the smallest average.",
                weeklyMonthTemperatures[2],
                lowestAverageForTesting.lowestAverage(weeklyMonthTemperatures)
                );
    }
}
