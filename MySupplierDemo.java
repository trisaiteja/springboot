package com;

import java.util.function.Supplier;

@CopyRight
public class MySupplierDemo {

	public static void main(String[] args) {
		Supplier<Employee> supplier = () -> {
			return new Employee(1, "Trisaiteja", "Narina", "9962040345", "Bhimavaram");
		};
		System.out.println(supplier.get().toString());
		
		MySupplier<Employee> mySupplier = () -> {
			return new Employee(2, "Vijaykumar", "Sivaraju", "9962314578", "Ongole");
		};
		System.out.println(mySupplier.get().toString());
	}

}
