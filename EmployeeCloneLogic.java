package com;

@CopyRight
public class EmployeeCloneLogic {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Trisaiteja", "Narina", "9962040345", "Bhimavaram");
		Employee e2 = null;
		try {
			Object obj = e1.clone();
			if(obj instanceof Employee) {
				e2 = (Employee) obj;
			}
		} catch(CloneNotSupportedException ce) {
			ce.printStackTrace();
		}
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	}

}
