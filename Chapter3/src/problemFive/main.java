/**
Jacob Haig
Chapter 3 
Problem 5 
Handouts 2
 */

package problemFive;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.print("Enter a Value: ");
		Scanner kb = new Scanner(System.in);
		double a = kb.nextDouble();
		if (a % 2 == 1)
			System.out.print("Odd");
		else
			System.out.print("Even");
	}

}
