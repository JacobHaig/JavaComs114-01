/**
Jacob Haig
Chapter 3 
Problem 8 
Handouts 3
 */

package problemEigth;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Selection code: ");
		int Selection = kb.nextInt();
		String manu = "";

		switch (Selection) {
		case 1:
			manu = "3M Corporation";
			break;
		case 2:
			manu = "Maxell Corporation";
			break;
		case 3:
			manu = "Sony Corporation";
			break;
		case 4:
			manu = "Verbatim Corporation";
			break;
		default:
			manu = "Error. not Valid";
		}

		System.out.print("Selection: " + manu);

	}

}
