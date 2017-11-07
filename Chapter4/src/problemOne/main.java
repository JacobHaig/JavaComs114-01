/**
Jacob Haig
Chapter 4 
Problem 1 
 */

package problemOne;

import java.util.Scanner;

public class main {
	// Function forLoop
	public static void whileLoop(int a, final int b) {
		while (a < b) {
			a++;
			System.out.println("A: " + a + ", B: " + b);
		}
	}
	
	// Function whileLoop
	public static void forLoop(int a, final int b) {
		for (;a <= b; a++) 
			System.out.println("A: " + a + ", B: " + b);
	}
	
	// Function main
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter A: ");
		int a = kb.nextInt();
		System.out.println("Enter B: ");
		int b = kb.nextInt();

		forLoop(a, b);
	}
}
