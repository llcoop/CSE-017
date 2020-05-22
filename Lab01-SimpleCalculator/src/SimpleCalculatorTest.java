import student.*;

// -------------------------------------------------------------------------
/**
 * Unit tests for the {@link SimpleCalculator} class.
 * 
 * @author Logan Cooper
 * @version 2017.2.1
 */
public class SimpleCalculatorTest extends student.TestCase {
    SimpleCalculator test;

    /**
     * Creates a new SimpleCalculatorTest object.
     */
    public SimpleCalculatorTest() 
    {
    	/**
    	 * empty for testing
    	 */
    }

    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp() {
        test = new SimpleCalculator(2.2, 1.1, '-');
    }

    /**
     * 
     */
    public void testGetOperand1() {
        assertEquals(2.2, test.getOperand1(), 0.01);
    }

    /**
     * 
     */
    public void testSetOperand1() {
        test.setOperand1(1.0);
        assertEquals(1.0, test.getOperand1(), 0.01);
    }

    /**
     * 
     */
    public void testGetOperand2() {
        assertEquals(1.1, test.getOperand2(), 0.01);
    }

    /**
     * 
     */
    public void testSetOperand2() {
        test.setOperand2(1.0);
        assertEquals(1.0, test.getOperand2(), 0.01);
    }

    /**
     * 
     */
    public void testGetOperator() {
        assertEquals('-', test.getOperator());
    }

    /**
     * 
     */
    public void testSetOperator() {
        test.setOperator('+');
        assertEquals('+', test.getOperator());
    }

    /**
     * 
     */
    public void testComputeOperation1() {
        test.setOperator('+');
        assertEquals(3.3, test.computeOperation(), 0.01);
    }

    /**
     * 
     */
    public void testComputeOperation2() {
        test.setOperator('-');
        assertEquals(1.1, test.computeOperation(), 0.01);
    }

    /**
     * 
     */
    public void testComputeOperation3() {
        test.setOperator('/');
        assertEquals(2.0, test.computeOperation(), 0.01);
    }

    /**
     * 
     */
    public void testComputeOperation4() {
        test.setOperator('*');
        assertEquals(2.42, test.computeOperation(), 0.01);
    }

    /**
     * 
     */
    public void testComputeOperation5() {
        test.setOperator('a');
        assertEquals(0, test.computeOperation(), 0.01);
    }
}
