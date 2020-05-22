/**
 * @author Logan Cooper
 * @version Feb, 18 2017
 *
 */
public class EventFinderTest extends student.TestCase {

    private EventFinder finder;
    private HistoricEvents timeline;
    private HistoricEvent event1;
    private HistoricEvent event2;
    private HistoricEvent event3;
    private HistoricEvent event4;
    
    /**
     * Creates a new test class
     */
    public EventFinderTest()
    {
        /**
         * Body empty for test class constructor
         */
    }
    /**
     * setup for testing
     */
    public void setUp()
    {
        finder = new EventFinder();
        timeline = new HistoricEvents();
        event1 = new HistoricEvent(724, "Liang Ling-Can",
                "Liang Ling-Can invents the first fully mechanical clock");
        event2 = new HistoricEvent(0, "LOL", "This is a test.");
        event3 = new HistoricEvent(9999, "Hey", "Test");
        event4 = new HistoricEvent(725, "Tests", 
                "Jet fuel can't melt steel beams");

    }
    
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind1()
    {
        assertEquals(1, finder.find(event1, timeline.getTimeline(), 0, 
                timeline.getTimeline().length));
        
    }
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind2()
    {
        assertEquals(0, finder.find(event2, timeline.getTimeline(), 0, 
                timeline.getTimeline().length));
        
    }
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind3()
    {
        assertEquals(timeline.getTimeline().length, 
                finder.find(event3, timeline.getTimeline(), 
                        0, timeline.getTimeline().length));
        
    }
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind4()
    {
        assertEquals(5, finder.find(event3, timeline.getTimeline(), 0, 
                5));
        
    }
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind5()
    {
        assertEquals(5, finder.find(event3, timeline.getTimeline(), 6, 
                5));
        
    }
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind6()
    {
        assertEquals(timeline.getTimeline().length, 
                finder.find(event3, 
                        timeline.getTimeline(), 6, 1000));
        
    }
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind7()
    {
        assertEquals(timeline.getTimeline().length, 
                finder.find(event3, 
                        timeline.getTimeline(), 6, 
                -1000));
        
    }
    /**
     * tests find() w/ 2 parameters
     */
    public void testFind8()
    {
        assertEquals(1, finder.find(event1, timeline.getTimeline()));
        
    }
    /**
     * tests find() w/ 2 parameters
     */
    public void testFind9()
    {
        assertEquals(0, finder.find(event2, timeline.getTimeline()));
        
    }
    /**
     * tests find() w/ 2 parameters
     */
    public void testFind10()
    {
        assertEquals(timeline.getTimeline().length, 
                finder.find(event3, 
                        timeline.getTimeline()));
        
    }
    
    /**
     * tests find() w/ 4 parameters
     */
    public void testFind11()
    {
        assertEquals(1, finder.find(event4, 
                timeline.getTimeline(), 1, 
                timeline.getTimeline().length));
        
    }
    /**
     * tests find() w/ 2 parameters
     */
    public void testFind12()
    {
        HistoricEvent[] timeline2 = {event1};
        assertEquals(0, finder.find(event2, timeline2));
        
    }
}
