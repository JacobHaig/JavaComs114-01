/**
Jacob Haig
Chapter 2 
Problem 6 
Handouts
 */

package problemSix;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		double Principal = Double.parseDouble(JOptionPane
				.showInputDialog("Original Balance "));
		double Rate = Double.parseDouble(JOptionPane
				.showInputDialog("Interest Rate Percent "))/100;
		double T = Double.parseDouble(JOptionPane
				.showInputDialog("Times compounded per year"));
		
		JOptionPane.showMessageDialog(null, "Amount " + (Principal * Math.pow((1 + Rate/T),T)) ); 

	}

}
