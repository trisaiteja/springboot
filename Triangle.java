package com.dp.creational.prototype;

import com.CopyRight;

@CopyRight
public class Triangle extends Shape {

	public Triangle() {
		type = "Triangle";
	}

	@Override
	public void draw() {
		System.out.println("This is a Triangle.");
	}

}
