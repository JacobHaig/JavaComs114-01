/**
Jacob Haig
Chapter 3 
Problem 6 
Handouts 3
 */

package problemSix;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter A: ");
		double a = kb.nextDouble();
		System.out.print("Enter B: ");
		double b = kb.nextDouble();
		System.out.print("Enter C: ");
		double c = kb.nextDouble();
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		

		if (a == b)
			System.out.println("The Equation is a Degenerate and has no roots");
		else if (discriminant < 0)
			System.out.println("The Roots are both imaginary");
		else {
			
			double result1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double result2 = (-b - Math.sqrt(discriminant)) / (2 * a);

			System.out.println("X1: " + result1);
			System.out.println("X2: " + result2);
		}
	}
}
