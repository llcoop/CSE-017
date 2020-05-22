import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Logan Cooper
 * @version Feb 10, 2017
 */
public class WeeklyNewspaperTest
    extends TestCase
{
    // ----------------------------------------------------------

// ~ Fields ................................................................

    /**
     * setup for testing
     */
    WeeklyNewspaper np1;
    /**
     * setup for testing
     */
    WeeklyNewspaper np2;

    // ~ Methods ...............................................................
    /**
     * Create a new WeeklyNewspaperTest object.
     */
    public WeeklyNewspaperTest() {
        /**
         * Empty constructor for test class
         */
    }


    // ----------------------------------------------------------
    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp()
    {
        np1 = new WeeklyNewspaper(69, "Test", 10, 2.50);
        np2 = new WeeklyNewspaper(49, "West", 11, 2.50);
    }
    
    /**
     * tests getId_Number()
     */
    public void testGetIdNumber() {
        assertEquals(69, np1.getIdNumber());
    }
    /**
     * tests getTitle()
     */
    public void testGetTitle() {
        assertEquals("Test", np1.getTitle());
    }
    /**
     * tests getNumber_Copies()
     */
    public void testGetNumberCopies() {
        assertEquals(10, np1.getNumberCopies());
    }
    /**
     * tests getPrice()
     */
    public void testGetPrice() {
        assertEquals(2.50, np1.getPrice(), 0.001);
    }
    /**
     * tests monthlyCost()
     */
    public void testMonthlyCost() {
        assertEquals(100, np1.monthlyCost(), 0.001);
    }
    /**
     * tests bundledWith()
     */
    public void testBundledWith() {
        assertEquals("West subscription is bundled with Test.", 
            np1.bundledWith(np2));
        assertEquals("", np1.bundledWith());
    }

}
