package com;

@CopyRight
public class Child implements ParentInterface1, ParentInterface2 {

	@Override
	public void m1() {
		System.out.println("Child m1");
	}

	public static void main(String[] args) {
		ParentInterface2 p2 = new Child();
		p2.m1();
	}

}
