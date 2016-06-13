package javaWeekOne;

import java.util.Scanner;

public class Lab6EnglishToPigLatin {

	public static void changeWord(String word) {

		String vowels[] = { "a", "e", "i", "o", "u" };
		if (word.toLowerCase().startsWith("a") || word.toLowerCase().startsWith("e")
				|| word.toLowerCase().startsWith("i") || word.toLowerCase().startsWith("o")
				|| word.toLowerCase().startsWith("u")) {
			word = word + "way ";
			System.out.print(word); // relatively easy if starts with vowel
		} else if (word.length() == 1) { // single letter word
			System.out.print(word + "ay");
		} else { // find index for first vowel
			String snip = "";
			String middle = "";

			for (int i = 0; i < word.length(); i++) { // CHANGE PER PETER
															// REMOVE
															// +1
				// first look at first letter. I added the plus one because I
				// was worried it
				// would go over the limit with my loop before.
				for (int z = 0; z < 5; z++) {// compare first letter to all the
											// vowels
					if (word.substring(i, i + 1).toLowerCase().equals(vowels[z])) {
						snip = word.substring(0, i);
//Hitting a vowel first time and break						middle = word.substring(i); // pretty clear how to
													// rearrange word
						word = middle + snip + "ay ";
						System.out.print(word);
						break;
	//MUst FIX					// z = 6; // this is to stop the loop from continuing
						// i = 100; // stop loop from continuing
					} else {
						System.out.print(word + "ay ");
						z = 6; // this is to stop the loop from continuing
						i = 100; // stop loop from continuing;
					}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean choice = true;
		Scanner scan = new Scanner(System.in); // open scanner first thing in
												// Main
		while (choice) { // start the loop that will allow person to choose to
							// go again.

			int spaceIndex = 0;
			String word = "";
			String restOfPig;
			System.out.println("Welcome to the Pig Latin Translator! ");
			System.out.println("Please enter a line to be translated. ");

			restOfPig = scan.nextLine(); // the main entry of the word

			System.out.println("You entered: " + restOfPig);

			while (spaceIndex >= 0) {
				spaceIndex = restOfPig.indexOf(" "); // index will be -1 if no "
														// "
				if (spaceIndex != -1) {

					word = restOfPig.substring(0, spaceIndex);
					// using space index to grab
					// the first
					// word
					restOfPig = restOfPig.substring(spaceIndex + 1); // the rest
																		// to be
																		// looped
					changeWord(word); // sends word to the method
				} else { // if no space then last word
					word = restOfPig;
					changeWord(word);
					break;
				}
			}
			System.out.println("\r Translate another line (y/n)");
			String proceed = scan.nextLine();
			if (!proceed.toLowerCase().contains("y")) { // anything other than
														// yes
				System.out.println("ok have a nice day");

				choice = false; // false is what would stop the loop
			}
		}
		scan.close();
	}
}
