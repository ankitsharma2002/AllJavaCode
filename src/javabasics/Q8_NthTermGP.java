package javabasics;

public class Q8_NthTermGP {
	public static int printNOfGP(int a, int r, int n) {
		return (a * (int) (Math.pow(a, n - 1)));
	}

	public static void main(String[] args) {
		int firstNumber = 10;
		int difference = 20;
		int printTillN = 5;
		System.out.println("The " + printTillN + "th term of the sequence is : "
				+ printNOfGP(firstNumber, difference, printTillN));
	}
}
	