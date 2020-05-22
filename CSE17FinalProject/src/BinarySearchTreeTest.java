import student.TestCase;
/**
 * Testing for the BinarySearchTree class
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class BinarySearchTreeTest extends TestCase {
    /**
     * 
     */
    private BinarySearchTree<String> bST;

    /**
     * 
     */
    public void setUp() {
        bST = new BinarySearchTree<String>();
    }

    /**
     * 
     */
    public void testInsert() {
        bST.insert("obj1");
        assertEquals("obj1", bST.find("obj1"));
        Exception thrown = null;
        try {
            bST.insert("obj1");

        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertTrue(thrown instanceof DuplicateItemException);
    }

    /**
     * 
     */
    public void testRemove() {
        Exception thrown = null;
        try {
            bST.remove("obj1");

        } 
        catch (Exception exception) {
            thrown = exception;
        }

        assertTrue(thrown instanceof ItemNotFoundException);
        bST.insert("A");
        bST.insert("B");
        bST.insert("C");
        bST.insert("D");
        bST.insert("E");
        bST.insert("F");
        bST.remove("D");
        bST.remove("C");
        assertEquals(null, bST.find("C"));
        assertEquals(null, bST.find("D"));
    }

    /**
     * 
     */
    public void testFindMin() {
        assertEquals(null, bST.findMin());
        bST.insert("F");
        bST.insert("T");
        bST.insert("X");
        bST.insert("C");
        assertEquals("C", bST.findMin());
    }

    /**
     * 
     */
    public void testFindMax() {
        assertEquals(null, bST.findMax());
        bST.insert("C");
        bST.insert("F");
        bST.insert("T");
        bST.insert("X");
        assertEquals("X", bST.findMax());
    }

    /**
     * 
     */
    public void testFind() {
        bST.insert("C");
        bST.insert("F");
        bST.insert("T");
        assertEquals("C", bST.find("C"));
        bST.remove("F");
        assertEquals(null, bST.find("F"));
    }

    /**
     * 
     */
    public void testEmpty() {
        bST.insert("X");
        bST.insert("J");
        bST.insert("W");
        assertFalse(bST.isEmpty());
        bST.makeEmpty();
        assertTrue(bST.isEmpty());
    }
}
