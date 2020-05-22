import student.*;

/**
 * @author Logan Cooper
 * @version Fed 3, 2017
 */
public class CompArrayTest extends student.TestCase {

    private CompArray test;
    private CompArray test2;
    private SuperArray g;

    /**
     * {@link CompArray}
     */
    public CompArrayTest() {
        /**
         * used for testing
         */
    }
    /**
     * {@link CompArray}
     */
    public void setUp() {
        test = new CompArray();
        g = new SuperArray();
        test2 = new CompArray(g);
    }

    /**
     * 
     */
    public void testGetAddCount() {
        assertEquals(0, test.getAddCount());
    }

    /**
     * 
     */
    public void testAdd() {
        Object o = new Object();
        test.add(o);
        assertEquals(1, test.getAddCount());
        test2.add(g);
        assertEquals(1, test2.getAddCount());
    }
    /**
     * 
     */
    public void testAddAll()
    {
        Object o = new Object();
        Object p = new Object();
        Object[] q = {o, p};
        test.addAll(q);
        assertEquals(2, test.getAddCount());
    }
}
