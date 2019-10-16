package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Comparator;

@CopyRight
public class Employee implements Externalizable, Comparable<Employee>, Cloneable {

	private int id;

	private String firstName;

	private String lastName;

	private String mobile;

	private String location;

	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, String mobile, String location) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.id != 0 && e.getId() != 0 && this.id == e.getId()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id * 2019 / 3;
	}

	@Override
	public int compareTo(Employee e) {
		return this.id - e.getId();
	}

	public static Comparator<Employee> employeeFirstNameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getFirstName().compareTo(e2.getFirstName());
		}
	};
	
	public static Comparator<Employee> employeeLastNameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getLastName().compareTo(e2.getLastName());
		}
	};

	@Override
	public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
		this.id = input.read();
		this.firstName = input.readUTF();
		this.lastName = input.readUTF();
		this.mobile = input.readUTF();
		this.location = input.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput output) throws IOException {
		output.write(id);
		output.writeUTF(firstName);
		output.writeUTF(lastName);
		output.writeUTF(mobile);
		output.writeUTF(location);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
