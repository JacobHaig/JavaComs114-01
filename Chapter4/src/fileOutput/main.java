package fileOutput;

import java.io.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your file name: ");
		String fileName = kb.nextLine();
		
		System.out.println("How many contacts: ");
		int number = kb.nextInt();
		kb.nextLine();
		
		File file = new File(fileName);
		FileWriter writer = new FileWriter(file);
		
		for(int i = 0; i < number; i++){
			System.out.println("Enter the "+i+" first name: ");
			String firstName = kb.nextLine();
			System.out.println("Enter the "+i+" last name: ");
			String lastName = kb.nextLine();
			System.out.println("Enter the "+i+" phone number: ");
			String phone = kb.nextLine();
			
			writer.write(firstName+", "+lastName+", "+phone);
			writer.write("\n");
		}
		
		writer.close();
		
	}

}
