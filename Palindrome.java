package com;

import java.util.Scanner;

public class Palindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int reminder = 0, temp = 0, result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = scanner.nextInt();
		temp = number;
		while(number != 0) {
			reminder = number % 10;
			result = reminder + result * 10;
			number = number / 10;
		}
		System.out.println(temp);
		System.out.println(result);
		if(result == temp) {
			System.out.println("Given number is Palindrome.");
		} else {
			System.out.println("Given number is not a Palindrome.");
		}
	}
}
