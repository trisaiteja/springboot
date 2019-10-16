package com;

@CopyRight
public class ExceptionHierarchy {
	public static void main(String[] args) {
		int x = 1, y = 0, z = 0;
		try {
			z = x / y;
			System.out.println("z: " + z);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
