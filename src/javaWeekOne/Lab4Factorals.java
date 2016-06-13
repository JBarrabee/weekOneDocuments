package javaWeekOne;

import java.util.Scanner;

public class Lab4Factorals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		System.out.println("Welcome to the Factorial Calculator!\r");
		while (repeat) {
			// (repeat) {
			// TODO Auto-generated method stub
			System.out.print("Enter an integer that's greater than 0 but less than 20:\r");
			int entry = scan.nextInt();

			if (entry < 1 || entry > 20) {
				System.out.println("Sorry your number was not in range. \r Please try again:");
				continue;
			}

			long a = 1;
			int count = 0;
			/*
			 * while (a > 0) { count++; a = a * (a + 1); } System.out.println(
			 * " number of times = " + count + "and " + a);
			 */
			for (int i = 1; i < entry + 1; i++) {
				a = a * (i);
				count += 1;
			}
			System.out.print("The factorial of " + entry + " is :" + a);

			System.out.print("\rContinue? y/n: ");
			String proceed = scan.next();
			if (!proceed.toLowerCase().contains("y")) {
				System.out.println("thanks for playing");
				repeat = false;
			}
		}
		scan.close();
	}
}
