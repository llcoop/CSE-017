import student.*
/**
 *  Unit tests for the {@link Pets} class.
 * 
 *  @author  Logan Cooper
 *  @version 2017.2.2
 */
public class PetsTest extends student.TestCase{

	Pets test1;
	Pets test2;

	public PetsTest(){}
	public void setUp()
	{
		Pets test1 = new Kitten("Zoe", "Tiger");
		Pets test2 = new Eagle("Gregor", "Eagle");
	}
	
	public void testGetName()
	{
		assertEquals("Zoe", test1.getName());
	}
	
	public void testSetName()
	{
		test1.setName("Joey");
		assertEquals("Joey", test1.getName());
	}
	public void testGetBreed()
	{
		assertEquals("Tiger", test1.getBreed());
	}
	public void testSetBreed()
	{
		test1.setBreed("Lion");
		assertEquals("Lion", test1.getBreed());
	}
	public void testMove1()
	{
		assertEquals("Zoe Runs", test1.Move());
	}
	public void testMove2()
	{
		assertEquals("Gregor Flies", test2.Move());
	}
}
