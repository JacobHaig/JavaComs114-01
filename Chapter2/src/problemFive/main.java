/**
Jacob Haig
Chapter 2 
Problem 5 
Handouts
 */

package problemFive;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		double Celsius = Double.parseDouble(JOptionPane
				.showInputDialog("Enter Temp in Celsius "));
		
		JOptionPane.showMessageDialog(null, "Fahrenheit is " + ((9 * Celsius)/5 + 32) ); 

	}

}
