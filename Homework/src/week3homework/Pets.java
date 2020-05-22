package week3homework;

/**
 * 
 * @author Logan Cooper
 * @version Feb 11, 2017
 *
 */
public abstract class Pets implements Motion {

	private String name;
	private String breed;
	private int age;

	/**
	 * @param name
	 *            the name of the pet
	 * @param breed
	 *            the breed of the pet
	 * @param age
	 *            the age of the pet
	 */
	public Pets(String name, String breed, int age) {
		this.setName(name);
		this.setBreed(breed);
		this.setAge(age);
	}

	public abstract String Move();

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name of the pet
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed
	 *            the breed of the pet
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age of the pet
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
