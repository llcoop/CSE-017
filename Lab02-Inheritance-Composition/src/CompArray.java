/**
 * @author Logan Cooper
 * @version Feb 3, 2017
 */
public class CompArray {
    private SuperArray s;
    private int addCount;

    /**
     * 
     */
    public CompArray() {
        s = new SuperArray();
        this.s = s;
        this.addCount = 0;
    }

    /**
     * @param s the super array
     */
    public CompArray(SuperArray s) {
        this.s = s;
    }

    /**
     * @param o the object added
     */
    public void add(Object o) {
        addCount++;
        s.add(o);
    }

    /**
     * @param c the object array added
     */
    public void addAll(Object[] c) {
        addCount += c.length;
        s.addAll(c);
    }

    /**
     * @return addCount
     */
    public int getAddCount() {
        return this.addCount;
    }
}