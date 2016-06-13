package javaWeekOne;

import java.util.Scanner;
// this is a test for Git 

public class Lab1 {
	static Scanner scan = new Scanner(System.in);

	public static void area(double length, double width) {
		System.out.println("Area: " + length * width);
	}

	public static void parimeter(double length, double width) {
		System.out.println("Perimiter: " + 2 * (length + width));
	}

	public static void volume(double length, double width, double height) {
		System.out.println("Volume: " + length * width * height);
	}

	public static double[] getNumberArea() {
		System.out.println("Enter Length");
		double length = scan.nextDouble();
		System.out.println("Enter Width");
		double width = scan.nextDouble();
		double[] array = { length, width };
		return array;

	}

	public static double getHeight() {
		System.out.println("Enter Length");
		double height = scan.nextDouble();
		return height;
	}

	public static void main(String[] args) {

		String choice = "y";
		while (choice.substring(0, 1).equalsIgnoreCase("y")) {
			System.out.println("Do you want to do volume or area or parimiter?");
			String choice2 = scan.next();
			if (choice2.substring(0, 1).equals("a")) {

				double[] area = getNumberArea();

				System.out.println(" width = " + area[0] + " height = " + area[1]);
				// double width = array[0];
				// area(array[0], array[1]);
				// System.out.println(" width = " + array[0] + " height = " +
				// array[1]);
			}

			String garbage = scan.nextLine();
			System.out.println("Continue? y/n:");
			choice = scan.next();
		}
		System.out.println("Have a good day.");
		scan.close();
	}
}
