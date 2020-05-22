
/**
 * @author Logan Cooper
 * @version Feb 3, 2017
 */
public class SubArray extends SuperArray {

    private int addCount;
    /**
     * {@link SubArray}
     */
    SubArray() {
        super();
        addCount = 0;
    }
    /**
     * 
     * @param arr an Object Array
     */
    SubArray(Object[] arr) {
        super(arr);
        addCount = 0;
    }

    /**
     * @return addCount
     */
    public int getAddCount() {
        return addCount;
    }
    /**
     * @param anEntry an Object
     */
    public void add(Object anEntry) {
        addCount++;
        super.add(anEntry);
    }
    /**
     * @param c an Object Array
     */
    public void addAll(Object[] c) {
        addCount += c.length;
        super.addAll(c);
    }
}
