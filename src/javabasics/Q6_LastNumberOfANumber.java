package javabasics;
// To find last digit of a number, we use modulo operator %. When modulo divided by 10 returns its last digit. 

public class Q6_LastNumberOfANumber {
	static int lastDigit(int num) {
		return num % 10;
	}
	public static void main(String[] args) {
		int num = 343234;
		System.out.println(lastDigit(Math.abs(num)));
	}
}
