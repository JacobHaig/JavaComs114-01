/**
Jacob Haig
Chapter 3 
Problem 2 
Handouts 2
 */

package problemTwo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		double grade = Double.parseDouble(JOptionPane
				.showInputDialog("What is the grade: "));

		if (grade >= 70)
			JOptionPane.showMessageDialog(null, "Pass!");
		else
			JOptionPane.showMessageDialog(null, "Fail!");

	}

}
