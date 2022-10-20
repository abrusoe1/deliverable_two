import java.util.Scanner;
import java.lang.Math;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Guess which will have more: heads or tails?");
		String headsOrTailsGuess = scnr.nextLine();
		
		System.out.println("How many flips? Please enter this as an integer.");
		int numberOfFlips = scnr.nextInt();
		
		int max = 2;
		int min = 1;
		int range = max - min + 1;
		
		int correctCount = 0;
		
		for (int i = 0; i < numberOfFlips; i++) {
			int rand = (int)(Math.random() * range) + min;
			
			if (rand > 1) {
				System.out.println("Heads");
			} else {
				System.out.println("Tails");
			}
			
			if(headsOrTailsGuess.equalsIgnoreCase("heads")) {
				if(rand > 1) {
					correctCount +=1;
				}
			} else if(headsOrTailsGuess.equalsIgnoreCase("tails")) {
				if(rand < 2) {
					correctCount +=1;
				}
			}
		}

		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		int correctPercentage = 100 * correctCount / numberOfFlips;
		System.out.println("That's " + correctPercentage + "%");
		
	}

}
