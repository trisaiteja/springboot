package com.dp.creational.singleton;

import com.CopyRight;

@CopyRight
public class SingletonDesignPattern {

	private static SingletonDesignPattern instance = new SingletonDesignPattern();

	private SingletonDesignPattern() {
	}

	public static SingletonDesignPattern getInstance() {
		synchronized (instance) {
			if (instance != null) {
				return instance;
			} else {
				return null;
			}
		}
	}

	public void print1() {
		System.out.println("Hello print1");
	}

	public void print2() {
		System.out.println("Hello print2");
	}

	public void print3() {
		System.out.println("Hello print3");
	}

}
