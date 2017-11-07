/**
Jacob Haig
Chapter 3 
Problem 3 
Handouts 2
 */

package problemThree;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// Program should be ran atleast 4 times
		double hoursWorked = Double.parseDouble(JOptionPane
				.showInputDialog("How many hours did you work?: "));

		double paycheck = 0;

		if (hoursWorked > 40)
			paycheck = 40 * 8 + (12 * (hoursWorked - 40));
		else
			paycheck = hoursWorked * 8;
		JOptionPane.showMessageDialog(null, "Your paycheck: $" + paycheck);

	}
}
