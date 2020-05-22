// -------------------------------------------------------------------------
/**
 *  Represents an employee who is paid an hourly wage.
 *
 *  @author  Logan Cooper
 *  @version Feb 10, 2017
 */
public class HourlyEmployee extends Employee
{
    //~ Instance/static fields ................................................


    //~ Constructor ...........................................................
    /**
     * @param name of the employee
     * @param payRate of the employee
     */
    public HourlyEmployee(String name, double payRate) {
        super(name, payRate);
    }
  //~ Methods ...............................................................

    @Override
    public double weeklyPay() {
        return 40 * this.getPayRate();
    }
}