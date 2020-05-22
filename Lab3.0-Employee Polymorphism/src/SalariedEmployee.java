// -------------------------------------------------------------------------
/**
 *  Represents an employee who is paid a yearly salary.
 *
 *  @author  Logan Cooper
 *  @version Feb 10, 2017
 */
public class SalariedEmployee extends Employee
{
    //~ Instance/static fields ................................................


    //~ Constructor ...........................................................
    /**
     * @param name of the employee
     * @param payRate of the employee
     */
    public SalariedEmployee(String name, double payRate) {
        super(name, payRate);
    }
    //~ Methods ...............................................................

    @Override
    public double weeklyPay() {
        return this.getPayRate();
    }
    /**
     * meet with another Salaried Employee
     * @param otherParticipant Salaried Employee
     * @return meeting String
     */
    public String meetWith(SalariedEmployee otherParticipant) {
        return otherParticipant.getName() + " is joining " 
             + this.getName() + " in a conference";
    }

}