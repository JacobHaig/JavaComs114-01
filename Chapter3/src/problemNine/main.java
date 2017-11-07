/**
Jacob Haig
Chapter 3 
Problem 9 
Handouts 3
 */

package problemNine;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Year: ");
		int Year = kb.nextInt();
		System.out.print("weight: ");
		int weight = kb.nextInt();

		double fee = 0;
		int Class = 0;

		if (Year < 1970) {
			if (weight < 2700) {
				Class = 1;
				fee = 16.5;
			}
			if (weight > 2700 && weight < 3800) {
				Class = 2;
				fee = 25.5;
			}
			if (weight > 3800) {
				Class = 3;
				fee = 46.5;
			}

		} else if (Year < 1979) {
			if (weight < 2700) {
				Class = 4;
				fee = 27.5;
			}
			if (weight > 2700 && weight < 3800) {
				Class = 5;
				fee = 30.5;
			}
			if (weight > 3800) {
				Class = 6;
				fee = 52.5;
			}

		} else {
			if (weight < 3500) {
				Class = 7;
				fee = 19.5;
			}
			if (weight > 3500) {
				Class = 8;
				fee = 52.5;
			}
		}

		System.out.println("The Fee: " + fee);
		System.out.println("The Class: " + Class);

	}
}
