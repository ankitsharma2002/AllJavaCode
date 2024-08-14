package javabasics;

import java.util.Scanner;

public class Q5_SumOfNNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number till you want sum of numbers : ");
		int sum = 0;
		int num = scn.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum till " + num + " th number is : " +sum);
	}
}
// Optimal solution comes with implementation of formula : (n*(n+1))/2;