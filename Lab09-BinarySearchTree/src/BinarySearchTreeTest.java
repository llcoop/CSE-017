import student.TestCase;


/**
 * @author Logan Cooper
 * @version 4/21/2017
 */
public class BinarySearchTreeTest extends TestCase
{
    
    private BinarySearchTree<String> tree;
    
    /**
     * constructor
     */
    public BinarySearchTreeTest()
    {
        /**
         * empty for testing
         */
    }
    /**
     * setup for testing
     */
    public void setUp()
    {
        tree = new BinarySearchTree<String>();
    }
    /**
     * tests find()
     */
    public void testFind()
    {
        tree.insert("G");
        tree.insert("A");
        tree.insert("B");
        tree.insert("K");
        tree.insert("Z");
        tree.insert("W");
        assertEquals("Z", tree.find("Z"));
    }
    /**
     * tests find()
     */
    public void testFindNull()
    {
        assertNull(tree.find("Z"));
    }
    /**
     * tests insert()
     */
    public void testInsert()
    {
        tree.insert("H");
        assertEquals("H", tree.find("H"));
    }
    /**
     * tests insert()
     */
    public void testInsert2()
    {
        tree.insert("H");
        tree.insert("G");
        tree.insert("A");
        tree.insert("B");
        tree.insert("K");
        tree.insert("Z");
        tree.insert("W");
        tree.insert("C");
        assertEquals("B", tree.find("B"));
    }
    
    /**
     * tests insert()
     */
    public void testInsertFull()
    {
        tree.insert("H");
        Exception ex = null;
        try {
            tree.insert("H");
        }
        catch (Exception e) {
            ex = e;
        }
        assertTrue(ex instanceof DuplicateItemException);
    }
    /**
     * tests remove()
     */
    public void testRemove()
    {
        tree.insert("H");
        tree.insert("G");
        tree.insert("C");
        tree.insert("A");
        tree.insert("B");
        tree.insert("Z");
        tree.insert("W");
        tree.remove("A");
        assertNull(tree.find("A"));
    }
    /**
     * tests remove()
     */
    public void testRemove2()
    {
        tree.insert("H");
        tree.insert("G");
        tree.insert("E");
        tree.insert("D");
        tree.insert("C");
        tree.insert("B");
        tree.insert("A");
        tree.remove("A");
        assertNull(tree.find("A"));
    }
    /**
     * tests remove()
     */
    public void testRemove3()
    {
        tree.insert("H");
        tree.insert("Z");
        tree.insert("D");
        tree.insert("W");
        tree.insert("X");
        tree.insert("Q");
        tree.insert("F");
        tree.insert("G");
        tree.insert("L");
        tree.remove("L");
        tree.remove("H");
        assertNull(tree.find("L"));
        assertNull(tree.find("H"));
    }
    /**
     * tests remove()
     */
    public void testRemove4()
    {
        tree.insert("H");
        tree.insert("Z");
        tree.insert("D");
        tree.insert("W");
        tree.insert("X");
        tree.insert("Q");
        tree.insert("F");
        tree.insert("G");
        tree.insert("L");
        tree.remove("D");
        tree.remove("Q");
        tree.remove("X");
        assertNull(tree.find("D"));
        assertNull(tree.find("Q"));
        assertNull(tree.find("X"));
    }
    /**
     * tests remove()
     */
    public void testRemoveNull()
    {
        Exception ex = null;
        try {
            tree.remove("H");
        }
        catch (Exception e) {
            ex = e;
        }
        assertTrue(ex instanceof ItemNotFoundException);
    }
    /**
     * tests isEmpty()
     */
    public void testIsEmpty()
    {
        assertTrue(tree.isEmpty());
        tree.insert("X");
        assertFalse(tree.isEmpty());
    }
    /**
     * tests makeEmpty()
     */
    public void testMakeEmpty()
    {
        tree.insert("H");
        tree.insert("Z");
        tree.makeEmpty();
        assertTrue(tree.isEmpty());
    }
    /**
     * tests findMax()
     */
    public void testFindMax()
    {
        tree.insert("G");
        tree.insert("A");
        tree.insert("B");
        tree.insert("K");
        tree.insert("Z");
        tree.insert("W");
        assertEquals("Z", tree.findMax());
    }
    /**
     * tests findMax()
     */
    public void testFindMaxNull()
    {
        assertNull(tree.findMax());
    }
    /**
     * tests findMin()
     */
    public void testFindMin()
    {
        tree.insert("G");
        tree.insert("A");
        tree.insert("B");
        tree.insert("K");
        tree.insert("Z");
        tree.insert("W");
        assertEquals("A", tree.findMin());
    }
    /**
     * tests FindMin()
     */
    public void testFindMinNull()
    {
        assertNull(tree.findMin());
    }

}
