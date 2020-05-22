import java.util.EmptyStackException;

//-------------------------------------------------------------------------
/**
 * An implementation of the stack data type that uses a linked chain of
 * {@code Node<E>} objects to store its contents.
 *
 * This is a PARTIAL IMPLEMENTATION that needs completion.
 *
 * @param <E> the type of elements stored in the stack
 *
 * @author Tony Allevato (authored class skeleton)
 * @author  Logan Cooper
 * @version 4/5/2017
 */
public class LinkedStack<E> implements StackInterface<E>
{
    //~ Fields ...............................................................

    private Node<E> head;


    /**
     * constructor
     */
    public LinkedStack()
    {
        head = null; 
    }


    //~ Methods ..............................................................

    // ----------------------------------------------------------
    /**
     * @param item item added
     */
    public void push(E item)
    {
        Node<E> newNext = head;
        head = new Node<E>(item);
        head.join(newNext);
    }


    // ----------------------------------------------------------
    /**
     * removes item from the top
     */
    public void pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        head = head.next();
    }


    // ----------------------------------------------------------
    /**
     * @return the top item
     */
    public E peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return head.data();
    }


    // ----------------------------------------------------------
    /**
     * @return if the stack is empty
     */
    public boolean isEmpty()
    {
        return head == null;
    }
}
