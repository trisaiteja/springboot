package com;

@CopyRight
public class ThreadExample1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread1 executed.");
	}

	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		t1.start();
	}

}
