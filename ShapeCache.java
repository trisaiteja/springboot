package com.dp.creational.prototype;

import java.util.Hashtable;

import com.CopyRight;

@CopyRight
public class ShapeCache {

	public static ShapeCache instance = new ShapeCache();

	public static Hashtable<String, Shape> shapeCache = new Hashtable<String, Shape>();

	private ShapeCache() {
	}

	public static ShapeCache getInstance() {
		synchronized (instance) {
			if (instance != null) {
				return instance;
			} else {
				return null;
			}
		}
	}

	public void loadCache() {
		Triangle triangle = new Triangle();
		triangle.setId("1");
		shapeCache.put(triangle.getId(), triangle);

		Square square = new Square();
		square.setId("2");
		shapeCache.put(square.getId(), square);

		Circle circle = new Circle();
		circle.setId("3");
		shapeCache.put(circle.getId(), circle);
	}

	public Shape getShape(String shapeId) {
		Shape cloneShape = shapeCache.get(shapeId);
		return (Shape) cloneShape.clone();
	}
}
