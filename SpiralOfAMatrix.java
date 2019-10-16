package com;

import java.util.Scanner;

//TODO
@CopyRight
public class SpiralOfAMatrix {
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
		
		System.out.println("\nSpiral of the given matrix: ");
		for (int i = 0; i < m;) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
				if(j == n-1) {
					for (int k = 1; k < n; k++) {
						System.out.print(a[k][j]+" ");
						if(k == n-1) {
							break;
						}
					}
				}
			}
			break;
		}
	}
}
