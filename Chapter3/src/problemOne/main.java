/**
Jacob Haig
Chapter 3 
Problem 1 
Handouts 2
 */

package problemOne;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		double numYears = Double.parseDouble(JOptionPane
				.showInputDialog("Num of Years: "));
		double numAmount = Double.parseDouble(JOptionPane
				.showInputDialog("Amount: "));
		double interest;

		if (numYears >= 5)
			interest = .075;
		else
			interest = .054;

		JOptionPane.showMessageDialog(null, "Year: " + numYears
				+ "\nInterest: " + (interest * 100) + "\nNew Amount: "
				+ (numAmount * (1 + interest)));
	}

}
