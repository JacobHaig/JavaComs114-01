/**
Jacob Haig
Chapter 4 
Problem 1
Handouts 1
 */
package problemTwoHard;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int numOfScores = 0;
		// to display the list of the averages at the end
		ArrayList<Double> listOfAverages = new ArrayList<Double>();

		// take user input
		Scanner kb = new Scanner(System.in);
		System.out.println("How many Experiments?");
		int numOfExperiments = kb.nextInt();

		for (int i = 0; i < numOfExperiments; i++) {
			double sum = 0;
			// get the amount of scores for the specified test number
			System.out.println("How many Scores for test " + (i + 1) + "?");
			numOfScores = kb.nextInt();

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