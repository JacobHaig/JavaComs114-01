/**
Jacob Haig
Chapter 2 
Problem 3 
Handouts
*/

package problemFour;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		double X = Double.parseDouble(JOptionPane
				.showInputDialog("Enter varible X"));
		double Y = Double.parseDouble(JOptionPane
				.showInputDialog("Enter varible Y"));
		
		JOptionPane.showMessageDialog(null, "The Hypot is " + Math.sqrt(X*X + Y*Y)); 
	}

}
