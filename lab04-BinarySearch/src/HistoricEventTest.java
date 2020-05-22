import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link HistoricEvent} class.
 *
 * @author Logan Cooper
 * @version Feb, 17 2017
 */
public class HistoricEventTest
    extends TestCase
{
    //~ Instance/static variables .............................................

    private HistoricEvent event;
    private HistoricEvent event2;
    private HistoricEvent event3;
    private HistoricEvent event4;
    private HistoricEvent event5;
    private HistoricEvent event6;
    private HistoricEvent event7;

    private static final String TITLE = "CS 2114 Lab";
    private static final String MESSAGE =
        "I went to lab today, and I didn't even get a T-shirt.";


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new test class
     */
    public HistoricEventTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Starting conditions for all tests in this class.
     */
    public void setUp()
    {
        event = new HistoricEvent(2010, TITLE, MESSAGE);
        event2 = new HistoricEvent(2010, TITLE, MESSAGE);
        event3 = new HistoricEvent(2010, "DS 2114 Lab", MESSAGE);
        event4 = new HistoricEvent(2012, TITLE, MESSAGE);
        event5 = new HistoricEvent(2012, "DS 2114 Lab", MESSAGE);
        event6 = new HistoricEvent(2000, TITLE, MESSAGE);
        event7 = new HistoricEvent(2010, "AS 2114 Lab", MESSAGE);
    }


    // ----------------------------------------------------------
    /**
     * Test the constructor and accessors.
     */
    public void testAccessors()
    {
        assertEquals(2010, event.getYear());
        assertEquals(TITLE, event.getTitle());
        assertEquals(MESSAGE, event.getDescription());
    }


    // ----------------------------------------------------------
    /**
     * Test toString() on the event created in setUp().
     */
    public void testToString()
    {
        assertEquals("[2010] " + TITLE + ": " + MESSAGE, event.toString());
    }


    // ----------------------------------------------------------
    /**
     * Test toString() on an event with a null title.
     */
    public void testToString2()
    {
        event = new HistoricEvent(2010, MESSAGE);
        assertEquals("[2010] " + MESSAGE, event.toString());
    }


    // ----------------------------------------------------------
    /**
     * Test toString() on an event with a null description.
     */
    public void testToString3()
    {
        event = new HistoricEvent(2010, TITLE, null);
        assertEquals("[2010] " + TITLE, event.toString());
    }
    /**
     * Test compareTo(HistoricalEvent)
     */
    public void testCompareTo() {
        assertEquals(0, event.compareTo(event2));
    }
    /**
     * Test compareTo(HistoricalEvent)
     */
    public void testCompareTo2() {
        assertEquals(-1, event.compareTo(event4));
    }
    /**
     * Test compareTo(HistoricEvent)
     */
    public void testCompareTo3() {
        assertEquals(1, event.compareTo(event6));
    }
    /**
     * Test compareTo(HistoricEvent)
     */
    public void testCompareTo4() {
        assertEquals(-1, event.compareTo(event3));
    }
    /**
     * Test compareTo(HistoricEvent)
     */
    public void testCompareTo5() {
        assertEquals(1, event.compareTo(event7));
    }
    /**
     * Test compareTo(HistoricEvent)
     */
    public void testCompareTo6() {
        assertEquals(-1, event.compareTo(event5));
    }
}
