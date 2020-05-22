package cs2114.mazesolver;

/**
 * @author Logan Cooper
 * @version 2017.3.30
 */
public class Location implements ILocation {

    private int x;
    private int y;
    /**
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public ILocation north() {
        return new Location(x, y - 1);
    }

    @Override
    public ILocation south() {
        return new Location(x, y + 1);
    }

    @Override
    public ILocation west() {
        return new Location(x - 1, y);
    }

    @Override
    public ILocation east() {
        return new Location(x + 1, y);
    }
    /**
     * @param o the object being compared
     * @return whether the location is the same or not
     */
    public boolean equals(Object o)
    {
        return o instanceof Location 
                && x == ((Location) o).x() 
                && y == ((Location) o).y();
    }
    /**
     * @return the location as a String
     */
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

}
