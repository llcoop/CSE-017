package cs2114.mazesolver;

import student.TestCase;

/**
 * Tests for the {@link Location} class.
 * 
 * @author Logan Cooper
 * @version 2017.3.30
 */
public class LocationTest 
    extends TestCase
{
    private Location location;
    private Location location2;
    
    /**
     * Constructor
     */
    public LocationTest()
    {
        /**
         * empty for testing
         */
    }
    /**
     * setup for testing
     */
    public void setUp()
    {
        location = new Location(0, 0);
        location2 = new Location(0, 0);
    }
    
    /**
     * tests x()
     */
    public void testX()
    {
        assertEquals(0, location.x());
    }
    /**
     * tests y()
     */
    public void testY()
    {
        assertEquals(0, location.y());
    }
    /**
     * tests north()
     */
    public void testNorth()
    {
        assertEquals(0, location.north().x());
        assertEquals(-1, location.north().y());
    }
    /**
     * tests south()
     */
    public void testSouth()
    {
        assertEquals(0, location.south().x());
        assertEquals(1, location.south().y());
    }
    /**
     * tests east()
     */
    public void testEast()
    {
        assertEquals(1, location.east().x());
        assertEquals(0, location.east().y());
    }
    /**
     * tests west()
     */
    public void testWest()
    {
        assertEquals(-1, location.west().x());
        assertEquals(0, location.west().y());
    }
    /**
     * tests equals()
     */
    public void testEquals()
    {
        assertTrue(location.equals(location2));
    }
    /**
     * tests toString()
     */
    public void testToString()
    {
        assertEquals("(0, 0)", location.toString());
    }

}
