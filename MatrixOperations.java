package com;

import java.util.Scanner;

@CopyRight
public class MatrixOperations {

	public static void additionOfTwoMatrices(int rows, int columns, int a[][], int b[][], int c[][]) {
		System.out.println("Matrix A+B: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		displayMatrix(rows, columns, a, b, c);
	}

	public static void substractionOfTwoMatrices(int rows, int columns, int a[][], int b[][], int c[][]) {
		System.out.println("Matrix A-B: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		displayMatrix(rows, columns, a, b, c);
	}

	public static void multiplicationOfTwoMatrices(int rows, int columns, int a[][], int b[][], int c[][]) {
		System.out.println("Matrix AxB: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0; k < columns; k++) {
					c[i][j] = c[i][j] + a[i][k] * a[k][j];
				}
			}
		}
		displayMatrix(rows, columns, a, b, c);
	}

	public static void divisionOfTwoMatrices(int rows, int columns, int a[][], int b[][], int c[][]) {
		System.out.println("Matrix A/B: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				c[i][j] = a[i][j] / b[i][j];
			}
		}
		displayMatrix(rows, columns, a, b, c);
	}

	public static void traceOfAMatrice(int rows, int columns, int a[][]) {
		int trace = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == j) {
					trace = trace + a[i][j];
				}
			}
		}
		System.out.println("Trace of Matrix A: " + trace);
	}

	public static void displayMatrix(int rows, int columns, int a[][], int b[][], int c[][]) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int rows = 0, columns = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows of a matrix: ");
		rows = scanner.nextInt();
		System.out.println("Enter the number of columns of a matrix: ");
		columns = scanner.nextInt();

		int[][] a = new int[rows][columns];
		int[][] b = new int[rows][columns];
		int[][] c = new int[rows][columns];

		System.out.println("Enter the elements in a[" + rows + "][" + columns + "] matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter the elements in b[" + rows + "][" + columns + "] matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				b[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		System.out.println("Matrix A: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Matrix B: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		additionOfTwoMatrices(rows, columns, a, b, c);
		substractionOfTwoMatrices(rows, columns, a, b, c);
		multiplicationOfTwoMatrices(rows, columns, a, b, c);
		divisionOfTwoMatrices(rows, columns, a, b, c);
		traceOfAMatrice(rows, columns, a);

	}
}
