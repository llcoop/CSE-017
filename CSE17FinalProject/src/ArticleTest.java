import java.util.ArrayList;

import student.TestCase;

/**
 * Testing for the Article class
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 */
public class ArticleTest extends TestCase{

	/**
	 * creates an Article object for testing
	 */
	Article art1;
	/**
	 * set up for the testing
	 */
	public void setUp() {
		art1 = new Article("Times");
	}
	/**
	 * test for getFileName method
	 */
	public void TestGetFileName()
	{
		assertEquals("Times", art1.getFileName());
	}
	/**
	 * test for setFileName method
	 */
	public void testSetFileName()
	{
		art1.setFileName("Forbes");
		assertEquals("Forbes", art1.getFileName());
	}
	/**
	 * test for setRefs method
	 */
	public void testSetRefs()
	{
		ArrayList<Reference> x = new ArrayList<Reference>();
		art1.setRefs(x);
		assertEquals(x, art1.getRefs());
	}
	/**
	 * test for getRefs method
	 */
	public void testGetRefs()
	{
		ArrayList<Reference> x = new ArrayList<Reference>();
		art1.setRefs(x);
		assertEquals(x, art1.getRefs());
	}
}
