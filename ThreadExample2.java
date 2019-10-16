package com;

@CopyRight
public class ThreadExample2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread2 executed.");
	}

	public static void main(String[] args) {
		ThreadExample2 t2 = new ThreadExample2();
		Thread t3 = new Thread(t2);
		t3.start();
	}

}
