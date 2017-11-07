/**
Jacob Haig
Chapter 4 
Problem DiceGame
Handouts 2
 */
package diceGame;

import java.util.Random;
import static java.lang.System.*;

public class main {

	public static void main(String[] args) {
		boolean Winner = false, keepLooping = false;
		int wins = 0, loss = 0, tests = 10000;
		int total1 = 0, total2 = 0;

		Random r = new Random(); // Randomizer object

		for (int i = 0; i < tests; i++) {
			total1 = r.nextInt(6) + 1 + r.nextInt(6) + 1;

			keepLooping = true;
			if (total1 == 7) {
				keepLooping = false;
				Winner = true;
				wins++;
			}
			if (total1 == 2 || total1 == 3 || total1 == 12) {
				keepLooping = false;
				Winner = false;
				loss++;
			}

			while (keepLooping) {
				total2 = r.nextInt(6) + 1 + r.nextInt(6) + 1;

				if (total1 == total2) {
					keepLooping = false;
					Winner = true;
					wins++;
				}

				if (total2 == 7 || total2 == 11) {
					keepLooping = false;
					Winner = false;
					loss++;
				}
			}
		}
		System.out.println("Wins: " + wins + " Losses: " + loss);
		System.out.println("Win percentage is " + (double) wins / (wins + loss)
				* 100 + "%");
	}
}

/*
 * true: 9=4+5 9=6+3 
 * false: 9=6+3 7=2+5 
 * false: 11=5+6 11=5+6 <---- 
 * false: 9=3+6 7=4+3 
 * true: 7=4+3 7=6+1 
 * true: 7=5+2 7=4+3 
 * Wins: 4018 Losses: 6112 
 * Win percentage is 39.664363%
 */