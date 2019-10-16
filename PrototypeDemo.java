package com.dp.creational.prototype;

import com.CopyRight;

@CopyRight
public class PrototypeDemo {

	public static void main(String[] args) {
		ShapeCache.getInstance().loadCache();
		Shape shape = ShapeCache.getInstance().getShape("1");
		System.out.println("Shape: "+shape.getType());
		shape.draw();
	}

}
