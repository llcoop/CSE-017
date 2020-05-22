package week3homework;

/**
 * @author Logan Cooper
 * @version Feb 12, 2017
 *
 */
public class Rectangle implements Shape{

	private double width;
	private double length;
	/**
	 * @param width
	 *     the width of the rectangle
	 * @param length
	 *     the length of the rectangle
	 */
	public Rectangle() {
		width = 0;
		length = 0;
	}
	/**
	 * @param width
	 *     the width of the rectangle
	 * @param length
	 *     the length of the rectangle
	 */
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	/**
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	public double Area() {
		return length * width;
	}
	public double Perimeter() {
		return (length * 2) + (width * 2);
	}
}
