
// -------------------------------------------------------------------------
/**
 *  A unit test class for the SuperArray class.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Varun
 *  @version Feb 5, 2016
 */
public class SuperArrayTest extends student.TestCase
{

    private SuperArray suA;
    private SuperArray suB;
    /**
     * {@link SuperArray}
     */
    public void setUp()
    {
        String[] a = { "a", "b", "c", "d" };
        suA = new SuperArray(a);
        suB = new SuperArray();
    }

    // ----------------------------------------------------------
    /**
     * Test {@link SuperArray#addAll(Object[])}.
     */
    public void testAddAll()
    {
        //The original size of SuA is 4
        assertEquals(4, suA.getSize());
        String test = "testString";
        suA.add(test);
        //After adding the string test, the size should be 5
        assertEquals(5, suA.getSize());
    }
    /**
     * Test {@link SuperArray#getSize()}
     */
    public void testGetSize()
    {
        assertEquals(4, suA.getSize());
        assertEquals(0, suB.getSize());
    }

}
