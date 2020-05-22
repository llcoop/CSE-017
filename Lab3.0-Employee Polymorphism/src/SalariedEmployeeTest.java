import student.TestCase;

//-------------------------------------------------------------------------
/**
 *  Test cases for the SalariedEmployee class.
 *
 *  @author  Logan Cooper
 *  @version Feb 10, 2017
 */
public class SalariedEmployeeTest extends TestCase
{
    //~ Instance/static fields ...............................................
    /**
     * setup for employee 1
     */
    SalariedEmployee emp1;
    /**
     * setiup for employee 2
     */
    SalariedEmployee emp2;


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        emp1 = new SalariedEmployee("Moana", 4.5);
        emp2 = new SalariedEmployee("Beemo", 9.5);
    }


    /**
     *  test getname
     */
    public void testGetName() {
        assertEquals("Moana", emp1.getName());
    }
    /**
     * test getpayrate
     */
    public void testGetPayRate() {
        assertEquals(4.5, emp1.getPayRate(), 0.01);
    }
    /**
     *  test weeklypay
     */
    public void testWeeklyPay() {
        assertEquals(4.5, emp1.weeklyPay(), 0.01);
    }
    /**
     * test meetwith
     */
    public void testMeetWith() {
        assertEquals("Beemo is joining Moana in a "
                + "conference", emp1.meetWith(emp2));
    }
}
