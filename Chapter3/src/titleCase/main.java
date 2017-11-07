package titleCase;

import java.util.Scanner;

public class main {

	public static String titleCase(String str) {
		String newStr = "";

		String[] strs = str.split(" ");
		for (int i = 0; i < strs.length; i++)
			
			strs[i] = strs[i].replace(strs[i].charAt(0), strs[i].toUpperCase()
					.charAt(0));

		for (int i = 0; i < strs.length; i++)
			newStr += strs[i] + " ";
		return newStr;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter your Text");
		String str = kb.nextLine();

		System.out.println(titleCase(str));
	}
}
