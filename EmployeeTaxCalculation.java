package com;

import java.util.ArrayList;
import java.util.List;

@CopyRight
public class EmployeeTaxCalculation {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10000);
		list.add(20000);
		list.add(30000);
		list.add(40000);
		list.add(50000);
		
		System.out.println("2017-18 financial year salaries for the employee: "+list);
		
		int tax = 0;
		for (int i = 0; i < list.size(); i++) {
			tax = list.get(i) * 10 / 100;
			list.set(i, list.get(i)-tax);
		}
		
		System.out.println("2017-18 financial year salaries after deducting tax for all employee: "+list);
	}
}
