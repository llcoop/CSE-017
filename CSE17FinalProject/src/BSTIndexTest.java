import java.util.ArrayList;


import student.TestCase;

/**
 * Testing for the BSTIndex class
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class BSTIndexTest extends TestCase {

	/**
	 * creates BSTIndex objects for testing
	 */
	private BSTIndex tree1;
	private BSTIndex tree2;
	
	public void setUp()
	{
		tree1=new BSTIndex("I");
		tree2=new BSTIndex("K");
	}
	
	/**
	 * testing for the compareTo method
	 */
	public void testCompareTo()
	{
		assertTrue(tree1.compareTo(tree2)<0);
	}
	
	/**
	 * testing for the getTerm method
	 */
	public void testGetTerm()
	{
		assertEquals("I", tree1.getTerm());
	}
	
	/**
	 * testing for the setTerm method
	 */
	public void testSetTerm()
	{
		tree1.setTerm("K");
		assertEquals("K", tree1.getTerm());
	}
	
	/**
	 * testing for the setArticles method
	 */
	public void testSetArticles()
	{
		ArrayList<String> x = new ArrayList<String>();
		tree1.setArticles(x);
		assertEquals(x, tree1.getArticles());
	}
	
	/**
	 * testing for the getArticles method
	 */
	public void testGetArticles()
	{
		ArrayList<String> x = new ArrayList<String>();
		tree1.setArticles(x);
		assertEquals(x, tree1.getArticles());
	}
	
}
