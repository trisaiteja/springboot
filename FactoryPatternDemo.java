package com.dp.creational.factory;

import com.CopyRight;

@CopyRight
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("Square");
		shape.draw();
	}

}
