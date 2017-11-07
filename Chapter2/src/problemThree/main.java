/**
Jacob Haig
Chapter 2 
Problem 3 
Handouts
page 1 of 2
 */

package problemThree;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coords A = new Coords(3, 7);
		Coords B = new Coords(8, 12);
		
		JOptionPane.showMessageDialog(null, "The slope is \n" + 
				(B.Y - A.Y) / (B.X - A.X) );
	}

}
