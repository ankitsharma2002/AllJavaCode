package javabasics;

//In Java, there are four different ways for reading input from the user in
//the command line environment(console). 
//1.Using Buffered Reader Class

//To read other types, we use functions like Integer.parseInt(), Double.parseDouble(). To read multiple values, we use split(). 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsole {
	public static void main(String[] args) throws IOException {
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name);
	}
}
