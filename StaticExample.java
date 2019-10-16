package com;

@CopyRight
public class StaticExample {

	int x = 10;
	static int y = 10;

	StaticExample() {
		++x;
		++y;
		display();
	}

	private void display() {
		System.out.println("x: " + x + "\n" + "y: " + y + "\n***********************************");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new StaticExample();
		}
	}

}
