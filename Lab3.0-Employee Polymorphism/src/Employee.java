// -------------------------------------------------------------------------
/**
 *  Represents an employee in a company or business.
 *
 *  @author  Logan Cooper
 *  @version Feb 10, 2017
 */
public abstract class Employee implements MeetingParticipant
{
    //~ Instance/static fields ................................................

    private String name;        // The employee's name.
    private double payRate;     // The employee's pay rate.


    //~ Constructor ...........................................................

    /**
     * @param name of employee
     * @param payRate of employee
     */
    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    //~ Methods ...............................................................
    
    // ----------------------------------------------------------
    /**
     * Gets the employee's name.
     * @return the employee's name
     */
    public String getName()
    {
        return name;
    }


    // ----------------------------------------------------------
    /**
     * Gets the pay rate.
     * @return the pay rate
     */
    public double getPayRate()
    {
        return payRate;
    }
    /**
     * @return weekly pay of employee
     */
    public abstract double weeklyPay();
    /**
     * @param otherParticipant participant in the meeting
     * @return meeting String
     */
    public String meetWith(MeetingParticipant otherParticipant) {
        return this.name + " is meeting with " + otherParticipant.getName();
    }
}
