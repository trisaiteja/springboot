package com;

import java.util.Scanner;

@CopyRight
public class FactorialOfANumber {

	public static int factorialUsingRecursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialUsingRecursion(n - 1);
		}
	}

	public static int factorialUsingForLoop(int element) {
		int result = 1;
		for (int i = 1; i <= element; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element to calculate the factorial: ");
		int element = scanner.nextInt();
		scanner.close();
		System.out.println(factorialUsingForLoop(element));
		System.out.println(factorialUsingRecursion(element));
	}

}
