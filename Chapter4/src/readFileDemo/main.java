/**
Jacob Haig
Chapter 4 
Problem 3
read from File 
 */
package readFileDemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);

		System.out.println("What is your file name: ");
		String fileName = kb.nextLine();
		
		File file = new File(fileName);
		Scanner input = new Scanner(file);

		while (input.hasNextLine()){
			System.out.println(input.nextLine());
		}
	}
}
