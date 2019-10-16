package com;

import java.util.Scanner;

@CopyRight
public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a decimal number to convert to binary: ");
		int n = scanner.nextInt();
		scanner.close();

		StringBuilder sb = new StringBuilder();
		int remainder = 0;
		while (n != 0) {
			remainder = n % 2;
			sb.append(remainder);
			n = n / 2;
		}
		System.out.println(sb.reverse());
	}

}
