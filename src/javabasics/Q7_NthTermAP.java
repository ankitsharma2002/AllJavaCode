package javabasics;

// to print nth term we have first number, difference, tillNth ,
// Implement formula
public class Q7_NthTermAP {
	public static int printTillNNumber(int a, int d, int n) {
		return (a + (n - 1) * d);
	}

	public static void main(String[] args) {
		int firstNumber = 10;
		int difference = 20;
		int printTillN = 5;
		System.out.println("The " + printTillN + "th term of the sequence is : "
				+ printTillNNumber(firstNumber, difference, printTillN));
	}
}
