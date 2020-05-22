package week3homework;

/**
 * @author Logan Cooper
 * @version Feb 11, 2017
 *
 */
public class Fish extends Pets{

	/**
	 * @param name
	 *     the name of the fish
	 * @param breed
	 *     the breed of the fish
	 * @param age
	 *     the age of the fish
	 */
	public Fish(String name, String breed, int age) {
		super(name, breed, age);
	}

	public String Move() {
		return getName() + " Swims";
	}
}
