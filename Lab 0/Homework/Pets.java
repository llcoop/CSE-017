
/**
 * @author Logan Cooper
 * @version 2017.2.2
 */
public class Pets {
	private String name;
	private String breed;
	public int age;
	public String movement;

	/**
	 * @param name
	 * @param breed
	 */
	public Pets(String name, String breed) {
		this.setName(name);
		this.setBreed(breed);
		age = 0;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
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
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String Move() {
		return name + " " + movement;
	}
}
