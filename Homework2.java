/*
 * Dev Kapadia
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	 private String string1;

	 public Homework2(String string2) {
		 string1 = string2;
	 }


	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
	 public String upperase() {
		 string1.toUpperCase();
		 return string1;
	 }


	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */
	 public String strip(String string3) {
		 string3.replace(" ","");
		 string3.replace(",","");
		 string3.replace(".","");
		 string3.replace("!","");
		 return string3;
	 }


	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle();
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle();
		r3.translate(10, 20);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double height = rect.getHeight();
		double width = rect.getWidth();
		double perimeter = (2 * height) + (2 * width);
		return perimeter;


	}
	public static void main(String[] args) {
		Homework2 Dev = new Homework2("I Love Pie");
	}

}
