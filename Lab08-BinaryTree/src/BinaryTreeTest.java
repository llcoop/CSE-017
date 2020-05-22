import student.TestCase;
/**
 * @author Logan Cooper
 * @version 4/18/2017
 */
public class BinaryTreeTest extends TestCase
{

    private BinaryTree<String> tree;
    private BinaryTree<String> tree4;
    
    /**
     * constructor
     */
    public BinaryTreeTest()
    {
        /**
         * empty constructor for testing
         */
    }
    
    /**
     * setup for testing
     */
    public void setUp() {
        tree = new BinaryTree<String>("S");
        BinaryTree<String> tree2 = new BinaryTree<String>("B");
        BinaryTree<String> tree3 = new BinaryTree<String>("C");
        tree4 = new BinaryTree<String>("A", tree2, tree3);
        tree3 = new BinaryTree<String>("Y");
        tree3 = new BinaryTree<String>("X", tree3, null);
        tree3 = new BinaryTree<String>("W", null, tree3);
        tree4 = new BinaryTree<String>("Z", tree4, tree3);
    }
    
    /**
     * tests getElement()
     */
    public void testGetElement()
    {
        assertEquals("S", tree.getElement());
    }    
    
    /**
     * tests setElement()
     */
    public void testSetElement()
    {
        tree.setElement("T");
        assertEquals("T", tree.getElement());
    }
    
    /**
     * tests getLeft()
     */
    public void testGetLeft()
    {
        assertNull(tree.getLeft());
    }
    
    /**
     * tests getRight()
     */
    public void testGetRight()
    {
        assertNull(tree.getRight());
    }
    /**
     * tests setLeft()
     */
    public void testSetLeft()
    {
        tree.setLeft(tree);
        assertEquals(tree, tree.getLeft());
    }
    /**
     * tests setRight()
     */
    public void testSetRight()
    {
        tree.setRight(tree);
        assertEquals(tree, tree.getRight());
    }
    /**
     * tests size()
     */
    public void testSize()
    {
        BinaryTree<String> tree5 = new BinaryTree<String>(null);
        assertEquals(7, tree4.size());
        assertEquals(0, tree5.size());
    }
    /**
     * test height()
     */
    public void testHeight()
    {
        assertEquals(1, tree.height());
        assertEquals(4, tree4.height());
    }
    /**
     * tests clone()
     */
    public void testClone()
    {
        
        assertEquals(tree.getElement(), tree.clone().getElement());
        tree = new BinaryTree<String>("D", tree, tree);
        assertEquals(tree.getRight().getElement(), 
                tree.clone().getRight().getElement());
        assertEquals(tree.getLeft().getElement(), 
                tree.clone().getLeft().getElement());
    }
    /**
     * tests toPostOrderString()
     */
    public void testToPostOrderString()
    {
        assertEquals("(((B) (C) A) (((Y) X) W) Z)", tree4.toPostOrderString());
        tree = new BinaryTree<String>("S", null, tree);
        assertNotNull(tree.toPostOrderString());
    }
    /**
     * tests toPreOrderString()
     */
    public void testToPreOrderString()
    {
        assertEquals("(Z (A (B) (C)) (W (X (Y))))", tree4.toPreOrderString());
        tree = new BinaryTree<String>("S", null, tree);
        assertNotNull(tree.toPreOrderString());
    }
    /**
     * tests toInOrderString
     */
    public void testToInOrderString()
    {
        assertEquals("(((B) A (C)) Z (W ((Y) X ) ))", tree4.toInOrderString());
        tree = new BinaryTree<String>("S", null, tree);
        assertNotNull(tree.toInOrderString());
    }
}
