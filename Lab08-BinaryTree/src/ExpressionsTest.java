import student.TestCase;
/**
 * @author Logan Cooper
 * @version 4/19/2017
 */
public class ExpressionsTest extends TestCase {
    /**
     * constructor
     */
    public ExpressionsTest()
    {
        /**
         * empty for testing
         */
    }
    /**
     * tests Expression class
     */
    public void test()
    {
        Expressions.main(null);
        assertTrue(systemOut().getHistory()
                .contains("((A) - (B)) * (((C) + (D)) / (E)))"));
    }

}
