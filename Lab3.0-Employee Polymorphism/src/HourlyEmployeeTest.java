import student.TestCase;

//-------------------------------------------------------------------------
/**
 *  Test cases for the HourlyEmployee class.
 *
 *  @author  Logan Cooper
 *  @version Feb 10, 2017
 */
public class HourlyEmployeeTest extends TestCase
{
    //~ Instance/static fields ...............................................
    /**
     * setup for employee 1
     */
    HourlyEmployee emp1;
    /**
     * setup for employee 2
     */
    HourlyEmployee emp2;


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        emp1 = new HourlyEmployee("Dory", 7);
        emp2 = new HourlyEmployee("Nemo", 3.5);
    }


    /**
     * test weeklypay
     */
    public void testWeeklyPay() {
        assertEquals(280, emp1.weeklyPay(), 0.01);
    }
    /**
     * test meetwith
     */
    public void testMeetWith()
    {
        assertEquals("Dory is meeting with Nemo", emp1.meetWith(emp2));
    }
}
