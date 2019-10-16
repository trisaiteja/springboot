package com;

@CopyRight
interface MathInterface {

	int operation(int x, int y);

	static int calculate1(int x, int y) {
		return x + y * x / y;
	}

	static int calculate2(int x, int y) {
		return x - y / x * y;
	}

	default void display() {
		System.out.println("display() method called!");
	}

	default void print() {
		System.out.println("print() method called!");
	}
}

@CopyRight
public class FunctionalInterfaceMaya {
	public static void main(String[] args) {

		System.out.println(MathInterface.calculate1(10, 20));

		System.out.println(MathInterface.calculate2(10, 20));

		MathInterface add = (int x, int y) -> x + y;
		MathInterface sub = (int x, int y) -> x - y;
		MathInterface mul = (int x, int y) -> x * y;

		System.out.println(add.operation(10, 20) + " --> " + sub.operation(10, 20) + " --> " + mul.operation(10, 20));

		add.display();
		add.print();
	}
}
