package com.dp.creational.factory;

import com.CopyRight;

@CopyRight
public class ShapeFactory {

	public Shape getShape(String type) {
		if (type.equals("Square")) {
			return new Square();
		} else if (type.equals("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
