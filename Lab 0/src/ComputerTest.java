import student.*;

// -------------------------------------------------------------------------
/**
 * Unit tests for the {@link Computer} class.
 * 
 * @author Logan Cooper
 * @version (2017.01.27)
 */
public class ComputerTest extends student.TestCase {
	// ~ Instance/static fields ...............................................
	Computer c;
	// ~ Constructor ..........................................................

	// ----------------------------------------------------------
	/**
	 * Creates a new ComputerTest object.
	 */
	public ComputerTest() {
		// The constructor is usually empty in unit tests, since it runs
		// once for the whole class, not once for each test method.
		// Per-test initialization should be placed in setUp() instead.
	}

	// ~ Methods ...............................................................

	// ----------------------------------------------------------
	/**
	 * Sets up the test fixture. Called before every test case method.
	 */
	public void setUp() {
		/* Insert your own setup code here */
		c = new Computer("Intel 4", 2, 200);
	}

	// ----------------------------------------------------------
	/* Insert your own test methods here */
	/**
	 * 
	 */
	public void testGetProcessor() {
		assertEquals("Intel 4", c.getProcessor());
	}

	/**
	 * 
	 */
	public void testSetProcessor() {
		c.setProcessor("Intel 2017");
		assertEquals("Intel 2017", c.getProcessor());
	}

	/**
	 * 
	 */
	public void testGetNumCores() {
		assertEquals(2, c.getNumCores());
	}

	/**
	 * 
	 */
	public void testSetNumCores() {
		c.setNumCores(4);
		assertEquals(4, c.getNumCores());
	}

	/**
	 * 
	 */
	public void testComputePower() {
		assertEquals(400, c.computePower(), 0);
	}

	/**
	 * 
	 */
	public void testToString() {
		assertEquals("Intel 4, 2 cores at 200.0GHz", c.toString());
	}
}