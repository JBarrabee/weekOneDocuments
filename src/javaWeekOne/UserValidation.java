package javaWeekOne;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user = "";

		boolean userGood = false;
		while (!userGood) {
			System.out.print("Please enter a new username: ");

			user = scan.nextLine();
			// minimum length 6
			if (user.length() < 6) {
				System.out.println("Sorry, you must have at least 6 characters");
			} else if (user.length() > 8) {
				System.out.println("Sorry, you must have at most 8 characters");
			} else if (user.indexOf('@') >= 0 || user.indexOf('-') >= 0 || user.indexOf('\"') >= 0) {
				System.out.println("Sorry, your username cannot contain @, -, or \"");
			} else {
				userGood = true;
			}
		}

		System.out.print("Welcome, " + user + " ");

		boolean pass2Good = false;
		String pass2 = "";
		while (!pass2Good) {

			boolean pass1Good = false;
			String pass1 = "";
			while (!pass1Good) {
				System.out.print("Please enter a new password: ");
				pass1 = scan.nextLine();
				// has to have upper and lower case
				if (pass1.toUpperCase().equals(pass1) || pass1.toLowerCase().equals(pass1)) {
					System.out.println("Sorry, you must use upper and lower case.");
				} else if (pass1.length() < 8) {
					System.out.println("Sorry, you must have at least 8 characters");
				} else {
					int numDigits = 0;
					for (int i = 0; i < pass1.length(); i++) {
						if (Character.isDigit(pass1.charAt(i))) {
							numDigits++;
							break;
						}
					}
					if (numDigits == 0) {
						System.out.println("Sorry, you must have at least 1 number");
					} else {
						pass1Good = true;
					}
				}
			}

			System.out.print("Please re-enter that password: ");
			pass2 = scan.nextLine();
			if (!pass1.equals(pass2))
				System.out.println("Sorry, your passwords don't match.");
			else
				pass2Good = true;
		}

		System.out.println("Password for user " + user + " set successfully.");
		scan.close();
	}

}
