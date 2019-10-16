package com.dp.creational.prototype;

import com.CopyRight;

@CopyRight
public class Circle extends Shape {
	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("This is a Circle");
	}
}
