package week3homework;

/**
 * @author Logan Cooper
 * @version Feb 11, 2017
 *
 */
public class Snake extends Pets {

	/**
	 * @param name
	 *            the name of the snake
	 * @param breed
	 *            the breed of the snake
	 * @param age
	 *            the age of the snake
	 */
	public Snake(String name, String breed, int age) {
		super(name, breed, age);
	}

	public String Move() {
		return getName() + " Slithers";
	}
}
