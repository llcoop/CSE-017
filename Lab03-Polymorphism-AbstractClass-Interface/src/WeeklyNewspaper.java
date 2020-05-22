
// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Logan Cooper
 * @version Feb, 10 2017
 */
public class WeeklyNewspaper extends Newspaper
{
    // ----------------------------------------------------------
    /**
     * Create a new WeeklyNewspaper object.
     *
     * @param idNumber
     *     the id number
     * @param title
     *     the title
     * @param numberCopies
     *     the number of copies
     * @param price
     *     the price of the newspaper
     */
    public WeeklyNewspaper(
        int idNumber,
        String title,
        int numberCopies,
        double price)
    {
        super(idNumber, title, numberCopies, price);
    }
    /**
     * @return the monthly cost
     */
    public double monthlyCost() {
        return 4 * super.getNumberCopies() * super.getPrice();
    }
    /**
     * @param otherNewspaper
     *     the other newspaper
     * @return bundled with
     */
    public String bundledWith(WeeklyNewspaper 
        otherNewspaper) {
        return otherNewspaper.getTitle() + 
            " subscription is bundled with " + getTitle() + ".";
    }
    /**
     * @return nothing
     */
    public String bundledWith() {
        return super.bundledWith(null);
    }
}
