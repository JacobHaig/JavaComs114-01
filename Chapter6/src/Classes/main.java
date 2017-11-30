/**
Jacob Haig
Chapter 6 
Class Circle
part 1 of 2
 */
package Classes;

import java.util.Scanner;

public class main {
	public static void main() {
		Scanner kb = new Scanner(System.in);

		System.out.print("Whats the radius of your circle: ");

		circle cir = new circle(kb.nextDouble());

		System.out.print("Area: " + cir.getArea());
		System.out.print("Diameter: " + cir.getDiameter());
		System.out.print("Circumference: " + cir.getCircumference());
	}

}
