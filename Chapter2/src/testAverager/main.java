/**
Jacob Haig
Chapter 2 
Problem 10
Test Average /w JPanes
 */

package testAverager;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String message = "";
    	int scoreSum = 0;
    	
    	int numOfScores = Integer.parseInt( JOptionPane.showInputDialog("Enter # of test"));
    	int[] testScores = new int[numOfScores];
    	
    	for(int i = 0; i < testScores.length; i++ )    		
    		testScores[i] = Integer.parseInt( JOptionPane.showInputDialog("Enter Test #" + (i + 1)));

    	
    	for(int j=0; j < testScores.length; j++){
    		message += "Test #" + (j + 1) + " : " + testScores[j] + "\n";
    		scoreSum += testScores[j];
    	}
    	
    	JOptionPane.showMessageDialog(null, message);
    	JOptionPane.showMessageDialog(null,"\n" + "The Average: " + (float)scoreSum / testScores.length);
	
	}

}
