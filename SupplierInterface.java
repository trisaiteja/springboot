package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@CopyRight
public class SupplierInterface {

	public static void main(String[] args) {

		List<Employee> listOfStrings = new ArrayList<Employee>();

		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());

		Supplier<List<Employee>> list = () -> {
			listOfStrings.add(new Employee(1, "Trisaiteja", "Narina", "9962040345", "Bhimavaram"));
			listOfStrings.add(new Employee(2, "Raja Sekhar", "Bobbadi", "9962040123", "Nandhyala"));
			return listOfStrings;
		};

		System.out.println(list.get());

	}

}
