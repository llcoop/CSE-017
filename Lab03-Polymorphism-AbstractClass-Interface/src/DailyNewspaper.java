
// -------------------------------------------------------------------------
/**
 * A daily version of the newspaper.
 *
 * @author Logan Cooper
 * @version Feb 10, 2017
 */
public class DailyNewspaper extends Newspaper

{
    // ----------------------------------------------------------
    /**
     * Create a new DailyNewspaper object.
     *
     * @param idNumber 
     *     the id number
     * @param title 
     *     the title
     * @param numberCopies
     *     the number of copies
     * @param price
     *     the price
     */
    public DailyNewspaper(
        int idNumber,
        String title,
        int numberCopies,
        double price)
    {
        super(idNumber, title, numberCopies, price);
    }
    /**
     * @return monthly cost
     */
    public double monthlyCost() {
        return 30 * super.getPrice() * super.getNumberCopies();
    }
    /**
     * @param otherNewspaper
     *     the bundled Subscription
     * @return the bundled with string
     */
    public String bundledWith(BundledSubscription otherNewspaper) {
        return getTitle() + " and " + 
        otherNewspaper.getTitle() + 
            " subscriptions are bundled.";
    }
}
