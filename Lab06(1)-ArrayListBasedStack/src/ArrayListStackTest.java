import java.util.EmptyStackException;

import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link ArrayListStack} class.
 *
 * @author Logan Cooper
 * @version 2017.03.26
 */
public class ArrayListStackTest
    extends TestCase
{
    //~ Instance/static variables .............................................

    private ArrayListStack<String> stack;


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates a brand new, empty stack for each test method.
     */
    public void setUp()
    {
        stack = new ArrayListStack<String>();
    }


    /**
     *  tests push()
     */
    public void testPush()
    {
        stack.push("A");
        stack.push("B");
        assertEquals(2, stack.size());
        assertEquals("B", stack.top());
        stack.push("C");
        assertEquals(3, stack.size());
        assertEquals("C", stack.top());
    }
    /**
     *  tests push()
     */
    public void testPushEmpty()
    {
        stack.push("A");
        assertEquals(1, stack.size());
        assertEquals("A", stack.top());
    }
    /**
     * tests pop()
     */
    public void testPop()
    {
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.pop();
        assertEquals(2, stack.size());
        assertEquals("B", stack.top());
        stack.pop();
        assertEquals(1, stack.size());
        assertEquals("A", stack.top());
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
        catch (Exception exception)
        {
            thrown = exception;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof EmptyStackException);
    }
    /**
     * tests top()
     */
    public void testTop()
    {
        stack.push("A");
        assertEquals("A", stack.top());
        stack.push("B");
        assertEquals("B", stack.top());
        stack.push("C");
        assertEquals("C", stack.top());
    }
    /**
     * tests top()
     */
    public void testTopEmpty()
    {
        Exception thrown = null;
        try
        {
            stack.top();
        }
        catch (Exception exception)
        {
            thrown = exception;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof EmptyStackException);
    }
    /**
     * tests size()
     */
    public void testSize()
    {
        stack.push("A");
        stack.push("B");
        assertEquals(2, stack.size());
    }
    /**
     * tests size()
     */
    public void testSizeEmpty()
    {
        assertEquals(0, stack.size());
    }
    /**
     * tests isEmpty
     */
    public void testIsEmpty()
    {
        assertTrue(stack.isEmpty());
    }
}
