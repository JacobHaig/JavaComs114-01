/**
Jacob Haig
Chapter 3 
Problem 4 
Handouts 2
 */

package problemFour;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Value a: ");
		double a = kb.nextDouble();
		System.out.print("Enter Value b: ");
		double b = kb.nextDouble();
		System.out.print("Enter Value c: ");
		double c = kb.nextDouble();
		double temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		System.out.print(a + " " + b + " " + c);
	}

}
