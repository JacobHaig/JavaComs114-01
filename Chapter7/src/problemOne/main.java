/**
Jacob Haig
Chapter 7 
problem 1
 */

package problemOne;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double[] months = initMonths();

		System.out.println("The total rainfall for the year is: "
				+ totalRainfall(months));
		System.out.println("The average monthly rainfall is: "
				+ averageRainfall(months));
		System.out.println("The month with the most rainfall is month: "
				+ (mostRainfall(months) + 1) + " which rained: "
				+ months[mostRainfall(months)]);
		System.out.println("The month with the least rainfall is month: "
				+ (leastRainfall(months) + 1) + " which rained: "
				+ months[leastRainfall(months)]);
	}

	// Inits all the rainfall for each month
	static double[] initMonths() {
		Scanner kb = new Scanner(System.in);
		double[] months = new double[12];

		// Enter all the rainfall for each month
		System.out.println("Enter the amount of rainfall for all 12 months!");
		for (int i = 0; i < months.length; i++) {
			System.out.print("Month " + (i + 1) + ": ");
			double amount;
			do
				amount = kb.nextDouble();
			while (amount < 0);
			months[i] = amount;
		}
		return months;
	}

	// Returns the index of the month with the least amount of rain
	static int leastRainfall(double[] months) {
		int least = 0;
		for (int i = 0; i < months.length; i++)
			if (months[i] < months[least])
				least = i;
		return least;
	}

	// Returns the index of the month with the most amount of rain
	static int mostRainfall(double[] months) {
		int most = 0;
		for (int i = 0; i < months.length; i++)
			if (months[i] > months[most])
				most = i;
		return most;
	}

	// Returns the average monthly rainfall
	static double averageRainfall(double[] months) {
		double sum = 0;
		for (int i = 0; i < months.length; i++)
			sum += months[i];
		return sum / months.length;
	}

	// Returns the total rainfall for that year
	static double totalRainfall(double[] months) {
		double sum = 0;
		for (int i = 0; i < months.length; i++)
			sum += months[i];
		return sum;
	}
}
/*
Enter the amount of rainfall for all 12 months!
Month 1: 9
Month 2: 5
Month 3: 6
Month 4: 17.
Month 5: 45
Month 6: 2.75
Month 7: 4
Month 8: 9
Month 9: 65
Month 10: 12
Month 11: 12.25
Month 12: 9.83
The total rainfall for the year is: 196.83
The average monthly rainfall is: 16.4025
The month with the most rainfall is month: 9 which rained: 65.0
The month with the least rainfall is month: 6 which rained: 2.75
*/