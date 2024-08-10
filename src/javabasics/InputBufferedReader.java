package javabasics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedReader {
	public static void main(String args[]) throws IOException {
		try {
			// Creating object of class inside main() method
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter an integer");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter a String");
			String b = br.readLine();

			// Printing input entities above
			System.out.printf("You have entered:- " + a + " and name as " + b);
		} finally {
			System.out.println("\nProgram Executed Successfully.");
		}
	}
}
