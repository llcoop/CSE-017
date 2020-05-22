import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link Node} class.
 *
 * @author Logan Cooper
 * @version 2017.03.31
 */
public class NodeTest
    extends TestCase
{
    //~ Instance/static variables .............................................

    private Node<String> node1;
    private Node<String> node2;
    private Node<String> node3;


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Create some new nodes for each test method.
     */
    public void setUp()
    {
        node1 = new Node<String>("node1");
        node2 = new Node<String>("node2");
        node3 = new Node<String>("node3");
    }

    /**
     * tests join()
     */
    public void testJoin() //2 different nodes
    {
        node1.join(node2);
        assertEquals(node2, node1.next());
        assertEquals(node1, node2.previous());
    }
    /**
     * tests join()
     */
    public void testJoin2() //self-link
    {
        node1.join(node1);
        assertEquals(node1, node1.next());
        assertEquals(node1, node1.previous());
    }
    /**
     * tests join()
     */
    public void testJoin3() //chain
    {
        node1.join(node2.join(node3));
        assertEquals(node1, node2.previous());
        assertEquals(node2, node1.next());
        assertEquals(node2, node3.previous());
        assertEquals(node3, node2.next());
    }
    /**
     * tests join()
     */
    public void testJoinNull() //null
    {
        node1.join(node2);
        Exception thrown = null;
        try
        {
            node1.join(node3);
        }
        catch (Exception e)
        {
            thrown = e;
        }

        assertTrue(thrown instanceof IllegalStateException);
        assertEquals("One of the Nodes is already "
                + "linked.", thrown.getMessage());
    }
    /**
     * tests join()
     */
    public void testJoinNull2() //null
    {
        node1.join(node2);
        Exception thrown = null;
        try
        {
            node3.join(node2);
        }
        catch (Exception e)
        {
            thrown = e;
        }

        assertTrue(thrown instanceof IllegalStateException);
        assertEquals("One of the Nodes is already "
                + "linked.", thrown.getMessage());
    }
    /**
     * tests split()
     */
    public void testSplit()
    {
        node1.join(node2);
        assertEquals(node2, node1.split());
        assertNull(node1.next());
        assertNull(node2.previous());
        assertNull(node1.split());
    }
    /**
     * tests data()
     */
    public void testData()
    {
        assertEquals("node1", node1.data());
    }
    /**
     * tests setData()
     */
    public void testSetData()
    {
        node1.setData("node2");
        assertEquals("node2", node1.data());
    }
}
