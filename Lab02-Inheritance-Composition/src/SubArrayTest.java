import student.*;
/**
 * @author Logan Cooper
 * @version Fed 3, 2017
 */
public class SubArrayTest extends student.TestCase {

    private SubArray sa;
    private SubArray sb;

    /**
     * 
     */
    public SubArrayTest() {
        /**
         * used for testing
         */
    }
    /**
     * {@link SubArray}
     */
    public void setUp() {
        sa = new SubArray();
        String[] a = { "a", "b", "c", "d" };
        sa.addAll(a);
        sb = new SubArray(a);
        sb.addAll(a);
    }

    /**
     * 
     */
    public void testGetAddCount() {
        assertEquals(8, sa.getAddCount());
    }
    /**
     * 
     */
    public void testGetAddCount2()
    {
        assertEquals(8, sb.getAddCount());
    }
}
