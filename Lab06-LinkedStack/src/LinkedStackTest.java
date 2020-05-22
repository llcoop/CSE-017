import java.util.EmptyStackException;

import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link LinkedStack} class.
 *
 * @author Logan Cooper
 * @version 2017.03.31
 */
public class LinkedStackTest
    extends TestCase
{
    //~ Instance/static variables .............................................

    private LinkedStack<String> stack;


    /**
     * empty constructor
     */
    public LinkedStackTest()
    {
        /**
         * empty for testing
         */
    }
    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates a brand new, empty stack for each test method.
     */
    public void setUp()
    {
        stack = new LinkedStack<String>();
    }

    /**
     * tests isEmpty()
     */
    public void testIsEmpty()
    {
        assertTrue(stack.isEmpty());
    }
    /**
     * tests peek()
     */
    public void testPeekEmpty()
    {
        Exception thrown = null;
        try
        {
            stack.peek();
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof EmptyStackException);
    }
    /**
     * tests peek()
     */
    public void testPeek()
    {
        stack.push("S");
        assertEquals("S", stack.peek());
    }
    /**
     * tests pop()
     */
    public void testPopEmpty()
    {
        Exception thrown = null;
        try
        {
            stack.pop();
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof EmptyStackException);
    }
    /**
     * tests pop()
     */
    public void testPop()
    {
        stack.push("S");
        stack.push("I");
        stack.pop();
        assertEquals("S", stack.peek());
    }
    /**
     * tests push()
     */
    public void testPush()
    {
        stack.push("S");
        assertEquals("S", stack.peek());
        stack.push("I");
        assertEquals("I", stack.peek());
    }
}
