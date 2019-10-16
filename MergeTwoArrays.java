package com;

@CopyRight
public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 5, 6, 7, 8 };
		int[] result = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}

		for (int i = 0, j = a.length; i < b.length && j < result.length; i++, j++) {
			result[j] = b[i];
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
