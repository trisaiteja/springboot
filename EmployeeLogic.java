package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CopyRight
public class EmployeeLogic {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Trisaiteja", "Narina", "9962040345", "Bhimavaram"));
		list.add(new Employee(2, "Dhanushkodi", "Balaiah", "9962012245", "Chennai"));
		list.add(new Employee(4, "Praveen", "Reddy", "9962040111", "Hyderabad"));
		list.add(new Employee(3, "Rajsekhar", "Bobbadi", "9962040123", "Nandhyala"));
		list.add(new Employee(3, "Rajsekhar", "Bobbadi", "9962040123", "Nandhyala"));

		System.out.println("Before sorting: " + list);
		Collections.sort(list);
		System.out.println();
		System.out.println("After sorting: " + list);

		System.out.println();

		Collections.sort(list, Employee.employeeFirstNameComparator);
		System.out.println(list);
	}
}
