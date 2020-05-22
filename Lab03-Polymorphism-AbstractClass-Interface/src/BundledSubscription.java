
/**
 * @author Logan Cooper
 * @version Feb 10, 2017
 */
public interface BundledSubscription {
    /**
     * @return title 
     *     the title of the newspaper
     */
    public abstract String getTitle();
    /**
     * @param otherNewspaper
     *     the other newspaper
     * @return bundled with
     */
    public abstract String bundledWith(BundledSubscription 
            otherNewspaper);
}
