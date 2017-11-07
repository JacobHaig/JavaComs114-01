/**
Jacob Haig
Chapter 5 
Problem 2
 */
package problemOne;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the WholeSale price followed by the markUp percentage");
		double retailPrice = calculateRetail(kb.nextDouble(),kb.nextDouble());
		System.out.print("The retail Price: " + retailPrice);
	}

	public static double calculateRetail(double wholeSale, double markUp){
		return wholeSale * (markUp/100 + 1);
	}
}
/*
 * Enter the WholeSale price followed by the markUp percentage
 * 5 150
 * The retail Price: 12.5
 * 
 * OR on separate lines
 * 
 * Enter the WholeSale price followed by the markUp percentage
 * 5
 * 150
 * The retail Price: 12.5
*/
