package functions;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		print(getInput(kb));
	}

	public static void print(String... parts) {
		for (String part : parts)
			System.out.print(part);
	}

	public static String getInput(Scanner kb) {
		return kb.nextLine();
	}
}
