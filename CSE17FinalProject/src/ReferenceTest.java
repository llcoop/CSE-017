import student.TestCase;

/**
 * Reference class to hold the terms and their TFIDF values.
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 */
public class ReferenceTest extends TestCase{
	
	private Reference testcase;
	
	public void setUp()
	{
		testcase = new Reference("Hello", 2.1, 2.2, 4.4);
	}
	
	/**
	 * tests isAbove()
	 */
	public void testIsAbove()
	{
		assertTrue(testcase.isAbove());
	}
	/**
	 * tests setTerm()
	 */
	public void testSetTerm()
	{
		testcase.setTerm("Hi");
		assertEquals("Hi", testcase.getTerm());
	}
	/**
	 * tests getTerm()
	 */
	public void testGetTerm()
	{
		assertEquals("Hello", testcase.getTerm());
	}

	/**
	 * tests setTF()
	 */
	public void testSetTF()
	{
		testcase.setTF(6.9);
		assertEquals(6.9, testcase.getTF(), .1);
	}
	/**
	 * tests getTF()
	 */
	public void testGetTF()
	{
		assertEquals(2.1, testcase.getTF(), .1);
	}
	/**
	 * tests setIDF()
	 */
	public void testSetIDF()
	{
		testcase.setIDF(6.9);
		assertEquals(6.9, testcase.getIDF(), .1);
	}
	/**
	 * tests getIDF()
	 */
	public void testGetIDF()
	{
		assertEquals(2.2, testcase.getIDF(), .1);
	}
	/**
	 * tests setTFIDF()
	 */
	public void testSetTFIDF()
	{
		testcase.setTFIDF(6.9);
		assertEquals(6.9, testcase.getTFIDF(), .1);
	}
	/**
	 * tests getTFIDF()
	 */
	public void testGetTFIDF()
	{
		assertEquals(4.4, testcase.getTFIDF(), .1);
	}

}
