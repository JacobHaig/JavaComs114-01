package randomTestBubbleSort;

import java.util.Random;

public class main {
	public static void print(int[] myArray) {
		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + ", ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] myArray = new int[1000]; // an array with set size
		Random r = new Random(); // Randomizer object

		for (int i = 0; i < myArray.length; i++)
			myArray[i] = r.nextInt(myArray.length); // Fill the array with
													// random numbers

		print(myArray); // print the numbers out

		// Two smart for-loops pros: easy, simple, guaranteed  cons: inefficient
		for (int j = 0; j < myArray.length - 1; j++)
			for (int i = 0; i < myArray.length - j - 1; i++) // Smart for-loop
				if (myArray[i] > myArray[i + 1]) { // Swap numbers if the front
													// is greater
					int temp = myArray[i];
					myArray[i] = myArray[i + 1];
					myArray[i + 1] = temp;
				}

		print(myArray); // print the numbers out again

	}

}
