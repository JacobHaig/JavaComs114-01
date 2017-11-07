/**
Jacob Haig
Chapter 3 
Problem 7 
Handouts 3
 */

package problemSeven;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Number of Dependents: ");
		double DependAmount = kb.nextDouble() * 50;
		System.out.print("Hours worked: ");
		double Hours = kb.nextDouble();
		System.out.print("Hourly wage: ");
		double Wage = kb.nextDouble();

		double grossPay = Math.min(40, Hours) * Wage;
		if (Hours > 40)
			grossPay += Math.min(10, Hours - 40) * Wage * 3 / 2;
		if (Hours > 50)
			grossPay += Math.min(10, Hours - 50) * Wage * 2;

		double federalTax = .24 * grossPay - DependAmount;
		double ssTax = .08 * grossPay;

		System.out.println("Gross pay: " + grossPay);
		System.out.println("Federal Tax: " + federalTax);
		System.out.println("Social Security Tax: " + ssTax);
		System.out.println("Pay: " + (grossPay - (federalTax + ssTax)));
	}

}
