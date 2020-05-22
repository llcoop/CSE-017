package cs2114;

import student.TestCase;

/**
 * @author elloc_000
 *
 */
public class Lab08DequeTest extends TestCase{

	private Lab08Deque<String> deque;
	
	public void setUp()
	{
		deque = new Lab08Deque<String>();
	}
	public void testSize()
	{
		assertEquals(0, deque.size());
	}
	public void testEnqueueAtFront()
	{
		deque.enqueueAtFront("Hello");
		assertEquals(1, deque.size());
		assertEquals("Hello", deque.frontItem());
		deque.enqueueAtFront("Holo");
		assertEquals(2, deque.size());
		assertEquals("Holo", deque.frontItem());
		deque.enqueueAtFront("Hel");
		assertEquals(3, deque.size());
		assertEquals("Hel", deque.frontItem());
	}
	public void testEnqueueAtRear()
	{
		deque.enqueueAtRear("Hello");
		assertEquals(1, deque.size());
		assertEquals("Hello", deque.rearItem());
		deque.enqueueAtRear("Holo");
		assertEquals(2, deque.size());
		assertEquals("Holo", deque.rearItem());
		deque.enqueueAtRear("Hel");
		assertEquals(3, deque.size());
		assertEquals("Hel", deque.rearItem());
	}
	public void testdequeueAtFront()
	{
		deque.enqueueAtFront("Hello");
		deque.enqueueAtFront("Holo");
		deque.enqueueAtFront("Hel");
		assertEquals("Hel", deque.dequeueAtFront());
		assertEquals(2, deque.size());
		assertEquals("Holo", deque.frontItem());
	}
	public void testdequeueAtFront1()
	{
		Exception ex = null;
		try {
			deque.dequeueAtFront();
		}
		catch(Exception e) {
			ex = e;
		}
		assertTrue(ex instanceof IllegalStateException);
	}
	public void testdequeueAtRear()
	{
		deque.enqueueAtRear("Hello");
		deque.enqueueAtRear("Holo");
		deque.enqueueAtRear("Hel");
		assertEquals("Hel", deque.dequeueAtRear());
		assertEquals(2, deque.size());
		assertEquals("Holo", deque.rearItem());
	}
	public void testdequeueAtRear1()
	{
		Exception ex = null;
		try {
			deque.dequeueAtRear();
		}
		catch(Exception e) {
			ex = e;
		}
		assertTrue(ex instanceof IllegalStateException);
	}
	public void testClear()
	{
		deque.enqueueAtRear("Hello");
		deque.enqueueAtRear("Holo");
		deque.clear();
		assertEquals(0, deque.size());
	}
	public void testToString()
	{
		deque.enqueueAtRear("Hello");
		deque.enqueueAtRear("Holo");
		deque.enqueueAtRear("Hel");
		assertEquals("[Hello, Holo, Hel]", deque.toString());
	}
}
