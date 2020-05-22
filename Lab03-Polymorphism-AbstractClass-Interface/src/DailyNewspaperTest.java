import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Logan Cooper
 * @version Feb 10, 2017
 */
public class DailyNewspaperTest
    extends TestCase
{
    // ~ Fields ................................................................
    /**
     * Setup for testing
     */
    DailyNewspaper np1;
    /**
     * Setup for testing
     */
    DailyNewspaper np2;
    // ~ Methods ...............................................................
    /**
     * Create a new DailyNewspaperTest object.
     */
    public DailyNewspaperTest()
    {
        /**
         * empty for testing purposes
         */
    }


    // ----------------------------------------------------------
    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp()
    {
        np1 = new DailyNewspaper(21, "Vader", 2, 1.5);
        np2 = new DailyNewspaper(66, "Anakin", 2, 1.5);
    }
    /**
     * tests monthlyCost()
     */
    public void testMonthlyCost() {
        assertEquals(90, np1.monthlyCost(), 0.001);
    }
    /**
     * tests bundledWith()
     */
    public void testBundledWith() {
        assertEquals("Vader and Anakin subscriptions are bundled.", 
            np1.bundledWith(np2));
    }
}
