package javabasics;

import java.util.Scanner;

//Difference Between Scanner and BufferedReader Class in Java
public class InputScanner {
	public static void main(String args[]) {
		System.out.println(
				"Hello, \nTo execute program please enter the data in single stream because scanner takes input by parsing");
		try (// Creating object of Scanner class to
				// read input from keyboard
				Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter an integer");

			// Using nextInt() to parse integer values
			int a = scn.nextInt();

			System.out.println("Enter a String");

			// Using nextLine() to parse string values
			String b = scn.nextLine();

			// Display name and age entered above
			System.out.printf("You have entered:- " + a + " " + "and name as " + b);
		} finally {
			System.out.println("\nProgram executed Successfully.");
		}
	}
}