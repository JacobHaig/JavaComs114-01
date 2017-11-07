/**
Jacob Haig
Chapter 4 
Problem 2
Handouts 1
 */
package problemThree;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int numOfScores = 3;
		int numOfPlayers = 5;
		int sumOfPlayers = 0;
		// to display the list of the averages at the end
		ArrayList<Double> listOfAverages = new ArrayList<Double>();
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < numOfPlayers; i++) {
			double sum = 0;
			// get the score for the specified Player
			for (int j = 0; j < numOfScores; j++) {
				System.out.println("What is score " + (j + 1) + " for Person #"
						+ (i + 1) + "?");
				// add to the sum
				sum += kb.nextDouble();
			}
			// get average then add to list of the averages
			listOfAverages.add(sum / numOfScores);
		}

		// display the list of the averages
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.println("Player " + (i + 1) + " average is "
					+ listOfAverages.get(i));
			sumOfPlayers += listOfAverages.get(i);
		}
		System.out.println("The team average is " + sumOfPlayers
				/ listOfAverages.size());
	}
}