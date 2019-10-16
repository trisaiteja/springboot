package com;

@CopyRight
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 10, 5, 16, 41, 14 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (i == a.length -1) {
					System.out.println();
				}
				if (a[i] < a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
//					
//					a[i] = a[i] + a[j];
//					a[j] = a[i] - a[j];
//					a[i] = a[i] - a[j];
//					a[j] = a[i] - a[j];
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
