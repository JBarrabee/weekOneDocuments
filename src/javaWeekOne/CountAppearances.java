// Jonpaul
//6/9/16
//Could not fix, try again later.
package javaWeekOne;

public class CountAppearances {

	public static void main(String[] args) {

		String s1 = "The rain in Spain falls mainly on the plain"; // 5
		String s2 = "This is the end of this sentence, isn't it?";

		System.out.println("'in' appears in " + s1 + " " + count(s1, "in") + " times");
		// position 7 then position 9
		System.out.println("'ain' appears in " + s1 + " " + count(s1, "ain") + " times");
		System.out.println("'is' appears in " + s2 + " " + count(s2, "is") + " times");
		// System.out.println(s1.length());
		// System.out.println(s2.length());
		// bonus: add a countWhole method which only counts appearances of the
		// target String as a whole word
		// System.out.println("'is' appears as a whole word in " + s2 + " " +
		// countWhole(s2, "is") + " times");
	}

	public static int count(String sentence, String target) {

		int count = 0;
		int indexLocation = 0;

		for (int i = 0; i < sentence.length() - target.length(); i++) { //
			// don't go longer than the sentence
			// problem if try to find target in the last character
			if (sentence.indexOf(target, indexLocation) >= 0) { // first
				// appearance
				// after 0 is 5
				// > 0;
				count++; // count goes up
				// System.out.println(sentence.indexOf(target, indexLocation));

				indexLocation = sentence.indexOf(target, indexLocation) + target.length();
			}
		}
		// System.out.println(indexLocation);

		// here's where the magic happens!

		return count;
	}
}
