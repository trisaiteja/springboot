package com;

@CopyRight
public class ReturnInForLoop {
	
	public static int returnValue() {
		for (int i = 0; i <= 5; i++) {
			if(i > 2) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int n = returnValue();
		System.out.println(n);
	}

}
