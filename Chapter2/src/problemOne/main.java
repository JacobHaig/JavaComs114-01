/**
Jacob Haig
Chapter 2 
Problem 1
Handouts
 */

package problemOne;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		double A = Double.parseDouble(JOptionPane
				.showInputDialog("Enter varible A"));
		double B = Double.parseDouble(JOptionPane
				.showInputDialog("Enter varible B"));
		double C = Double.parseDouble(JOptionPane
				.showInputDialog("Enter varible C"));
		double X = Double.parseDouble(JOptionPane
				.showInputDialog("Enter varible X"));

		double result = A * Math.pow(X, 2) + B * X + C;
		JOptionPane.showMessageDialog(null, result);
	}
}
