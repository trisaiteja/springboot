package com;

@CopyRight(authorName="Eshwaran")
public class TwoPowerNTriangleMatrix {

	public static void main(String[] args) {
		int i = 1;
		StringBuilder sb = new StringBuilder();
		int lineSize = 5;
		for (int k = 1; k <= lineSize; k++) {
			for (int j = 0; j < k; j++) {
				i = i * 2;
				sb.append(i).append("\t");

			}
			System.out.println(sb);
			sb = new StringBuilder();
		}
	}

}
