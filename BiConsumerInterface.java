package com;

import java.util.function.BiConsumer;

@CopyRight
public class BiConsumerInterface {

	public static void main(String[] args) {

		BiConsumer<Integer, String> biList1 = (intVal, strVal) -> {
			intVal = (strVal != null ? strVal.length() : 0);
			System.out.println("String arg length: " + intVal);
		};

		BiConsumer<Integer, String> biList2 = (intVal, strVal) -> {
			System.out.println(intVal + " -> " + strVal);
		};

		biList1.andThen(biList2).andThen(biList2).accept(2, "two");

	}

}
