/**
Jacob Haig
Chapter 5 
Problem 3
 */
package problemTwo;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Length followed by the Width");
		displayData(getArea(getLength(kb), getWidth(kb)));
	}

	public static double getLength(Scanner kb) {
		return kb.nextDouble();
	}

	public static double getWidth(Scanner kb) {
		return kb.nextDouble();
	}

	public static double getArea(double l, double w) {
		return l * w;
	}

	public static void displayData(double area) {
		System.out.println(area);
	}
}
/*
 * Enter the Length followed by the Width 
 * 15 10 
 * 150.0
 * 
 * Or on separate lines
 * 
 * Enter the Length followed by the Width 
 * 15 
 * 10 
 * 150.0
 */