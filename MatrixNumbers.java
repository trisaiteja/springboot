package com;

import java.util.Scanner;

public class MatrixNumbers {

	public static void main(String[] args) {
		int m = 0, n = 0;
		int[][] a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		m = scanner.nextInt();
		System.out.println("Enter the no.of columns: ");
		n = scanner.nextInt();
		a = new int[m][n];
		
		System.out.println("\nEnter the elements in a matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		System.out.println("\nGiven matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Required result: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
