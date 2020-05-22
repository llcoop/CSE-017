
// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Logan Cooper
 * @version Feb, 10 2017
 */
public abstract class Newspaper implements BundledSubscription
{
    private int    idNumber;
    private String title;
    private int    numberCopies;
    private double price;


    /**
     * @param idNumber 
     *     the id numer
     * @param title 
     *     the title
     * @param numberCopies 
     *     the number of copies
     * @param price 
     *     the price of the newspaper
     */
    public Newspaper(int idNumber, String title, 
            int numberCopies, double price) {
        this.idNumber = idNumber;
        this.title = title;
        this.numberCopies = numberCopies;
        this.price = price;
    }


    // ----------------------------------------------------------
    /**
     * @return the id_number of the Newspaper
     */
    public int getIdNumber()
    {
        return idNumber;
    }


    // ----------------------------------------------------------
    /**
     * @return the title of the Newspaper
     */
    public String getTitle()
    {
        return title;
    }


    // ----------------------------------------------------------
    /**
     * @return the number_copies of the Newspaper
     */
    public int getNumberCopies()
    {
        return numberCopies;
    }


    // ----------------------------------------------------------
    /**
     * @return the price
     */
    public double getPrice()
    {
        return price;
    }
    /**
     * @return monthly cost
     */
    public abstract double monthlyCost();
    /**
     * 
     * @param otherNewspaper
     *     the Bundled Subscription
     * @return String 
     */
    public String bundledWith(BundledSubscription 
        otherNewspaper) {
        return "";
    }
}
