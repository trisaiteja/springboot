package com;

import java.util.ArrayList;
import java.util.List;

public class NumberType<T extends Number> {
	T t1;
	T t2;

	NumberType() {
	}

	NumberType(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List<NumberType> typeList = new ArrayList<NumberType>();

		NumberType<Byte> byteType = new NumberType<Byte>((byte) 10, (byte) 20);
		typeList.add(byteType);

		NumberType<Short> shortType = new NumberType<Short>((short) 10, (short) 20);
		typeList.add(shortType);

		NumberType<Integer> intType = new NumberType<Integer>(10, 20);
		typeList.add(intType);

		NumberType<Float> floatType = new NumberType<Float>(10.23f, 20.24f);
		typeList.add(floatType);

		NumberType<Double> doubleType = new NumberType<Double>(10.234546, 20.244561);
		typeList.add(doubleType);
		
		typeList.forEach(numType -> System.out.println(numType.getT1()+" --> "+numType.getT2()));
	}
}
