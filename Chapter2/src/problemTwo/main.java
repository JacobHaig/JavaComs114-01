/**
Jacob Haig
Chapter 2 
Problem 2 
Handouts
page 1 of 2
 */

package problemTwo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Coords A = new Coords(3, 7);
		Coords B = new Coords(8, 12);
		
		JOptionPane.showMessageDialog(null, "The mid point is at \n" + 
				((A.X+ B.X)/2) +", "+ ((A.Y+ B.Y)/2));
	}
}
