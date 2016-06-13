package javaWeekOne;
// Jonpaul Barrabee

//June 7, 2016
//Second Lab

import java.util.Scanner;

public class Lab2ChooseAdventure {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean repeat = true;
		boolean innerRepeat = true;
		System.out.println("Welcome to your adventure.");
		while (repeat) {
			while (innerRepeat) {
				System.out.println("Is today Monday, Tuesday, or Wednesday?");
				String day = scan.next();
				if (day.toLowerCase().contains("m")) {
					boolean monday = true;
					System.out.println("So it is Monday.  You are walking out of the Brodrick building ");
					System.out.println(
							"and you hear a emergency siren going off.  People are running South down Woodward. ");
					while (monday) {
						System.out.println("Do you run North or South?");
						String direction = scan.next();
						if (direction.toLowerCase().contains("n")) {
							boolean north = true;
							System.out.println("You run North.  You want to find out what is causing them to run.");
							System.out.println(
									"The groud starts to shake.  A fleeing person you are attracted to falls down.");
							while (north) {
								System.out.println(" Do you stop to help that person or do you continue North?");
								String help = scan.next();
								if (help.toLowerCase().contains("h") || help.toLowerCase().contains("s")
										|| help.toLowerCase().contains("y")) {
									System.out.println(
											"You decide to help the person.  You pick up the person and carry them ");
									System.out.println(
											"into the nearest building.  You look out the window and a huge monster ");
									System.out.println(
											"walks by your building. You are safe and a week later you are married. ");
									innerRepeat = false;
									north = false;
									monday = false;
								} // if help
								else if (help.toLowerCase().contains("c") || help.toLowerCase().contains("n")) {
									System.out.println(
											"You decide to not help the person.  You end up running West and living.");
									System.out.println("You are not killed by the monster but karma gets you later.");
									innerRepeat = false;
									north = false;
									monday = false;
								} // if not help
								else {
									System.out.println("You entered an incorrect response, Please try again");
								} // if wrong entry
							} // while north
						} // if north
						if (direction.toLowerCase().contains("s")) {
							boolean south = true;
							System.out.println(
									"You decide to run South.  You get to the Guardian building with the vault.");
							while (south) {
								System.out.println("Do you go into the vault to get away from whatever?");
								String vault = scan.next();
								if (vault.toLowerCase().contains("v") || vault.toLowerCase().contains("y")) {
									System.out
											.println("You go into the vault.  Many other people crowd in behind you. ");
									System.out.println("You get crushed and die.");
									innerRepeat = false;
									south = false;
									monday = false;
								} // choice vault
								else if (vault.toLowerCase().contains("n")) {
									boolean trySwim = true;
									System.out.println(
											"You decide not to go into the vault.  You continue down to the Detroit River");
									while (trySwim) {
										System.out.println("Do you know how to swim?");
										String swim = scan.next();
										if (swim.toLowerCase().contains("n")) {
											System.out.println(
													"You try to swim anyway because there is a huge monster coming down the ");
											System.out.println(
													"street eating people.  You should have learned to swim.  You drown.");
											innerRepeat = false;
											south = false;
											trySwim = false;
											monday = false;
										} // choice can't swim
										else if (swim.toLowerCase().contains("y")) {
											System.out.println(
													"You know how to swim.  You jump in and make it safely to the otherside.");
											System.out
													.println("You end up living in Canada for the rest of your life.");
											innerRepeat = false;
											south = false;
											trySwim = false;
											monday = false;
										} // choice can swim
										else {
											System.out.println("You entered an incorrect response, Please try again");
										} // wrong on swim
									} // while swim
								} // if Vault no
								else {
									System.out.println("You entered an incorrect response, Please try again");
								} // wrong on vault
							} // while south
						} // if South
						else {
							System.out.println("You entered an incorrect response, Please try again");
						} // wrong direction
					} // while Monday
				} // if Monday
				else if (day.toLowerCase().contains("t")) {
					boolean tuesday = true;
					System.out.println(
							"So it is Tuesday.  You walk out of the Broderick building and see Hilary Clinton.");
					while (tuesday) {
						System.out.println("Do you like Hilary?");
						String hilary = scan.next();
						if (hilary.toLowerCase().contains("y")) {
							System.out.println(
									"You like Hilary so you walk over to introduce yourself.  She shakes your hand");
							System.out.println("and you remember that moment for ever.");
							innerRepeat = false;
							tuesday = false;
						} // choice Hillary
						else if (hilary.toLowerCase().contains("n")) {
							boolean doNotLike = true;
							System.out.println(
									"You don't like Hilary so you make a snide coment.  The person next to you is ");
							System.out.println("offended and punches you in the stomach.");
							while (doNotLike) {
								System.out.println("Do you fight back or leave?");
								String fight = scan.next();
								if (fight.toLowerCase().contains("f")) {
									System.out
											.println("You fight back and are arrested by the police.  You will never ");
									System.out.println("forget this day.");
									innerRepeat = false;
									doNotLike = false;
									tuesday = false;
								} // choice fight
								else if (fight.toLowerCase().contains("l")) {
									System.out
											.println("You leave and forever wonder if that was the right thing to do.");
									innerRepeat = false;
									doNotLike = false;
									tuesday = false;
								} // leave no fight
								else {
									System.out.println("You entered an incorrect response, Please try again");
								} // mistake option
							} // while do not like
						} // if do not like
						else {
							System.out.println("You entered an incorrect response, Please try again");
						} // mistake on like
					} // while tues
				} // if tues
				else if (day.toLowerCase().contains("w")) {
					System.out.println("It is Wednesday.  You walk outside. Today you start the rest of your life.");
					innerRepeat = false;
				} else {
					System.out.println("You must pick a day.");
					System.out.println("Please Try Again.\r");
				} // if wed
			} // while inner repeat
			System.out.println("\n Do you want to do another story?");
			String story = scan.next();
			if (story.toLowerCase().contains("y")) {
				repeat = true;
				innerRepeat = true;
			} else {
				System.out.println("Have a nice day.");
				repeat = false;
			}
		} // while repeat
		scan.close();
	}
}
