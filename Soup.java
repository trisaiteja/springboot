package com.dp.creational.builder;

import com.CopyRight;

@CopyRight
public abstract class Soup implements Item {

	@Override
	public abstract String name();

	@Override
	public abstract float price();

	@Override
	public Packaging pack() {
		return new Bowl();
	}
}
