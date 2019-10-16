package com;

import java.util.Optional;

@CopyRight
public class OptionalEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee(1, null, "Narina", "9962040345", "Bhimavaram");
		Optional<Employee> employeeNullCheckObj = Optional.ofNullable(emp);
		if (employeeNullCheckObj.isPresent()) {
			System.out.println(
					(Optional.ofNullable(emp.getFirstName()).isPresent() ? emp.getFirstName() : "First Name is null"));
		} else {
			System.out.println("Employee object is null.");
		}

		Integer i = null;
		System.out.println(Optional.ofNullable(i).isPresent() ? i : "i is null");
	}
}
