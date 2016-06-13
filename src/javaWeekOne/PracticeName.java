
package javaWeekOne;

import java.util.Scanner;

public class PracticeName { /*
							 * // username should be at least 6 and no longer
							 * than 8 // prevent disallowed characters : % @ _ $
							 * , " or spaces " " // Check to see if they enter
							 * an email // Must contain a @ and a . after the @
							 * // password must have a number, upper and lower
							 * case, min length 8
							 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * boolean userGood = false; while (!userGood) { System.out.println(
		 * "Please enter a username:"); String user = scan.nextLine(); if
		 * (user.length() < 6) { System.out.println(
		 * "Sorry, you must have at least 6 characters"); } else if
		 * (user.length() > 8) { System.out.println(
		 * "Sorry, you must have at most 8 characters"); } else if
		 * (user.indexOf("@") >= 0 || user.indexOf("-") >= 0 || user.indexOf(" "
		 * ) >= 0) { System.out.println(
		 * "Sorry, you must not have @, - or \" \""); } else { userGood = true;
		 * } } boolean passMatch = false; while (!passMatch){
		 * 
		 * System.out.println("Please enter a password:");
		 * 
		 * // password must have a number, upper and lower case, min length 8
		 * boolean passGood =false;
		 * 
		 * while (!passGood) { System.out.println("Please enter a username:");
		 * String pass1 = scan.nextLine(); if (pass1.toUpperCase().equals
		 * (pass1) || pass1.toLowerCase().equals (pass1)) { System.out.println(
		 * "Sorry, your pass must have both lowercase and uppercse characters");
		 * else if (pass1.length() < 8) { System.out.println(
		 * "Sorry, you must have a minimum of 8 characters"); } }
		 * 
		 * System.out.println("Please re-enter your password:"); String pass2 =
		 * scan.nextLine(); else if (!pass1.equals(pass2) ){ }
		 * 
		 * } String pass2 = scan.nextLine(); // Matches pass1 case sensitive
		 * 
		 * // TODO Auto-generated method stub int n = 3; // A = 5;
		 * 
		 * scan.close(); // close the reader } }
		 */
	}
}
