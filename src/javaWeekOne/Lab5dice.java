package javaWeekOne;

import java.util.Random;
import java.util.Scanner;

public class Lab5dice {

	public static int printRoll(int diceSides) { // takes rand and does the
													// printout for roll
		Random rand = new Random(); // Random Class
		int roll = rand.nextInt(diceSides) + 1;
		System.out.println(roll);
		return roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean choice = true;

		System.out.print("Welcome to the Grand Circus Casino! Roll the dice (y/n): ");
		String proceed = scan.next();

		if (!proceed.toLowerCase().contains("y")) {
			System.out.println("ok have a nice day");
			choice = false;
		}
		while (choice) { // while needs true to loop
							// starts true and made false if do not want to
							// proceed
			System.out.println("How many sides do you want the dice to have: ");
			int diceSides = scan.nextInt();

			// Random rand = new Random(); // create rand variable
			System.out.println("Roll 1: ");
			printRoll(diceSides);
			printRoll(diceSides);

			System.out.println("Do you want to roll again? (y/n)");
			String proceed2 = scan.next();
			if (!proceed2.toLowerCase().contains("y")) {
				System.out.println("ok have a nice day");
				choice = false;
			}
		}
		scan.close();
	}
}
