import java.util.Iterator;
import java.util.NoSuchElementException;

import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link ArrayStack} class.
 *
 * @author Logan Cooper
 * @version 5/6/2107
 */
public class ArrayStackTest
    extends TestCase
{
    //~ Instance/static variables .............................................

    private Stack<String> stack;
    private Iterator<String> it;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new test class
     */
    public ArrayStackTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates a brand new, empty stack for each test method.
     */
    public void setUp()
    {
        stack = new ArrayStack<String>();
        it = null;
    }

    // ----------------------------------------------------------
    /**
     * Test the push() method.
     */
    public void testPush()
    {
        stack.push("hello");
        assertEquals(1, stack.size());
        assertEquals("hello", stack.top());

        stack.push("goodbye");
        assertEquals(2, stack.size());
        assertEquals("goodbye", stack.top());
    }
    
    /**
     * tests push()
     */
    public void testPush2()
    {
        stack.push("Hello");
        stack.push("World");
        stack.pop();
        stack.push("World");
        assertEquals("World", stack.top());
    }


    // ----------------------------------------------------------
    /**
     * Test the pop() method.
     */
    public void testPop()
    {
        String word = "hello";
        stack.push(word);
        assertEquals(1, stack.size());

        stack.pop();

        // After removal, make sure the inserted object is no longer there.
        assertEquals(0, stack.size());
    }
    
    /**
     * tests top()
     */
    public void testTopNull()
    {
        assertNull(stack.top());
    }
    
    /**
     * tests top()
     */
    public void testTop()
    {
        stack.push("Hello");
        assertEquals("Hello", stack.top());
    }


    // ----------------------------------------------------------
    /**
     * Test the topAndPop() method.
     */
    public void testTopAndPop()
    {
        String word = "hello";
        stack.push(word);

        // Use assertSame() to ensure the specific object added is the
        // one returned here
        assertSame(word, stack.topAndPop());

        // After removal, make sure the inserted object is no longer there.
        assertEquals(0, stack.size());
    }


    // ----------------------------------------------------------
    /**
     * Test clear() with multiple values in the stack.
     */
    public void testRemove3()
    {
        String word1 = "hello";
        stack.push(word1);
        String word2 = "goodbye";
        stack.push(word2);
        assertEquals(2, stack.size());

        stack.clear();
        assertEquals(0, stack.size());
    }
    
    /**
     * tests iterator()
     */
    public void testIterator()
    {
        assertNotNull(stack.iterator());
    }
    
    /**
     * tests hasNext()
     */
    public void testHasNext()
    {
        assertFalse(stack.iterator().hasNext());
    }
    
    /**
     * tests hasNext()
     */
    public void testNextLoop()
    {
        stack.push("Hi");
        stack.push("Hey");
        stack.push("Hello");
        it = stack.iterator();
        while (it.hasNext())
        {
            assertNotNull(it.next());
        }
    }
    
    /**
     * tests next()
     */
    public void testNextNull()
    {
        Exception occurred = null;
        try
        {
            stack.iterator().next();
        }
        catch (Exception exception)
        {
            occurred = exception;
        }
        assertNotNull(occurred);
        assertTrue(occurred instanceof NoSuchElementException);
        assertEquals("Error: no more items", occurred.getMessage());
    }
    /**
     * tests next()
     */
    public void testNextNotNull()
    {
        stack.push("Hello");
        assertEquals("Hello", stack.iterator().next());
    }
    /**
     * tests remove()
     */
    public void testRemoveNull()
    {
        Exception occurred = null;
        try
        {
            stack.iterator().remove();
        }
        catch (Exception exception)
        {
            occurred = exception;
        }
        assertNotNull(occurred);
        assertTrue(occurred instanceof IllegalStateException);
        assertEquals("next() method not invoked", occurred.getMessage());
    }
}
