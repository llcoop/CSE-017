import java.util.Random;
import java.util.ArrayList;
import java.util.List;

//-------------------------------------------------------------------------
/**
 * This class represents an implementation of a bag collection
 * that internally uses an ArrayList to hold the items.
 *
 * This is a PARTIAL IMPLEMENTATION that needs completion.
 *
 * @param <T> The type of items this bag will hold.
 *
 * @author John Lewis, Tony Allevato (authored class skeleton)
 * @author Logan Cooper
 * @version 3/24/2017
 */
public class ListBasedBag<T>
    implements Bag<T>
{
    //~ Instance/static variables .............................................

    // The default initial capacity of the bag
    private static final int DEFAULT_CAPACITY = 100;

    // A single random number generator shared by all bags
    private static Random rand = sofia.util.Random.generator();

    // You write the declaration for this field:
    private ArrayList<T> contents;  // the bag contents


    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates an empty bag using the default capacity.
     */
    public ListBasedBag()
    {
        this(DEFAULT_CAPACITY);
    }


    // ----------------------------------------------------------
    /**
     * Creates an empty bag using the specified capacity.
     * @param initialCapacity
     */
    public ListBasedBag(int initialCapacity)
    {
        contents = new ArrayList<T>(initialCapacity);
    	// TODO: create an ArrayList to hold your contents, and set your
        // contents field to refer to this new object.  Be sure to create
        // the ArrayList with the specified capacity.
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Adds the specified element to the bag.
     *
     * @param element item to be added
     * @precondition parameter element is not null
     */
    public void add(T element)
    {
    	if (element == null){}
    	else contents.add(element);
    }


    // ----------------------------------------------------------
    /**
     * Removes and returns the specified element from the bag.  If multiple
     * copies of the same element appear in the bag, only one is removed.
     *
     * @param target item to be removed
     * @return the item removed or null if not found
     * @precondition parameter target is not null
     * @postcondition returned value x.equals(target)
     */
    public T remove(T target)
    {
        // The ArrayList class already provides two remove methods: one
        // that takes a numeric position (which you should use here), and
        // another that takes an object and searches for it (which you
        // may not use).  Implement this method by writing your own
        // loop (that is, without calling contains() or indexOf() on contents)
        // to find where the target is, then remove it by position using
        // the remove() method provided by the list.

        for (int i=0; i<size(); i++)
        {
        	if (target.equals(contents.get(i)))
        	{
        		return contents.remove(i);
        	}
        }
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Removes and returns a random element from the bag.
     *
     * @return the element removed or null if the bag is empty
     */
    public T removeRandom()
    {
        // TODO: implement
    	if (isEmpty())
    	{
    		return null;
    	}
    	return contents.remove((int) (Math.random()*contents.size()));
    }


    // ----------------------------------------------------------
    /**
     * Determines if the bag contains the specified element.
     *
     * @param target element to be found
     * @return true if target is in the collection, false otherwise
     * @precondition parameter target is not null
     */
    public boolean contains(T target)
    {
        assert target != null : "target cannot be null";

        // The ArrayList class already provides this method, but you need
        // to implement it from scratch (that is, without calling
        // contains() or indexOf() on contents) by writing your own loop.

        // TODO: implement
        for (T i : contents)
        {
        	if (target.equals(i)) return true;
        }
        return false;
    }


    // ----------------------------------------------------------
    /**
     * Determines if the bag contains no elements.
     *
     * @return true if collection is empty, false otherwise
     */
    public boolean isEmpty()
    {
    	return contents.size() <= 0;
    }


    // ----------------------------------------------------------
    /**
     * Determines the number of elements currently in the bag.
     *
     * @return the number of elements in the bag
     */
    public int size()
    {
    	return contents.size();
    }


    // ----------------------------------------------------------
    /**
     * Returns a string representation of this bag.  A bag's string
     * representation is written as a comma-separated list of its
     * contents (in some arbitrary order) surrounded by curly braces,
     * like this:
     * <pre>
     * {52, 14, 12, 119, 73, 80, 35}
     * </pre>
     * <p>
     * An empty bag is simply {}.
     * </p>
     *
     * @return a string representation of the bag and its contents
     */
    public String toString()
    {
        // The ArrayList class provides a different toString() that doesn't
        // use the same format.  You need to implement yours from scratch
        // (that is, without calling toString() on contents)

        // TODO: implement
    	String result = "[";
    	for (int i=0; i<size()-1; i++)
    	{
    		result += contents.get(i) + ", ";
    	}
    	result += contents.get(contents.size()) + "]";
    	return result;
    }
}
