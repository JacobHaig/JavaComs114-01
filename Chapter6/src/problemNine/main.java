/**
Jacob Haig
Chapter 6 
problem 9
part 1 of 2
 */
package problemNine;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the Temp outside: ");
		
		Temp NJ = new Temp(kb.nextDouble());

		System.out.println("It is " + NJ.getFahrenheit() + " Fahrenheit");
		System.out.println("It is " + NJ.getCelsius() + " Celsius");
		System.out.println("It is " + NJ.getKelvin() + " Kelvin");
	}
}
