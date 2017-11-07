/**
Jacob Haig
Chapter 4 
Problem 1
Handouts 1
 */
package problemTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int numOfScores = 3;
		int numOfExperiments = 4;
		// to display the list of the averages at the end
		ArrayList<Double> listOfAverages = new ArrayList<Double>();
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < numOfExperiments; i++) {
			double sum = 0;
			// get the score for the specified test number
			for (int j = 0; j < numOfScores; j++) {
				System.out.println("What is score " + (j + 1) + " for test "
						+ (i + 1) + "?");
				// add to the sum
				sum += kb.nextDouble();
			}
			// get average then add to list of the averages
			listOfAverages.add(sum / numOfScores);
		}

		// display the list of the averages
		for (int i = 0; i < numOfExperiments; i++)
			System.out.println("Test average " + (i + 1) + " is "
					+ listOfAverages.get(i));
	}
}