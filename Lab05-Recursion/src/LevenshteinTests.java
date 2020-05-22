import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Test cases for the Levenshtein distance algorithm.
 *
 * @author Logan Cooper
 * @version March 4, 2017
 */
public class LevenshteinTests
    extends student.TestCase
{
    Levenshtein test1;
    Levenshtein test2;
    Levenshtein test3;
    Levenshtein test4;
    Levenshtein test5;
    Levenshtein test6;
	
    /**
     * empty for testing
     */
    public LevenshteinTests(){}
    public void setUp()
	{
		test1 = new Levenshtein("", "cram");
		test2 = new Levenshtein("cram", "");
		test3 = new Levenshtein("", "");
		test4 = new Levenshtein("clap", "cram");
		test5 = new Levenshtein("mitt", "smitten");
		test6 = new Levenshtein("start", "cart");
	}
	
	/**
	 * tests distance()
	 */
	public void testDistance()
	{
		assertEquals(4, test1.distance());
	}
	/**
	 * tests distance()
	 */
	public void testDistance2()
	{
		assertEquals(4, test2.distance());
	}
	/**
	 * tests distance()
	 */
	public void testDistance3()
	{
		assertEquals(0, test3.distance());
	}
	/**
	 * tests distance()
	 */
	public void testDistance4()
	{
		assertEquals(2, test4.distance());
	}
	/**
	 * tests distance()
	 */
	public void testDistance5()
	{
		assertEquals(3, test5.distance());
	}
	/**
	 * tests distance()
	 */
	public void testDistance6()
	{
		assertEquals(2, test6.distance());
	}
}
