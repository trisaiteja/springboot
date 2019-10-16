package com;

import java.io.Serializable;

@CopyRight(authorName = "Eshwaran")
public class Student implements Serializable {

	private static final long serialVersionUID = 3256478316847683428L;

	private int id;

	private String name;

	Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {
		return this.id * 5;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student stud = (Student) obj;
			return (stud.getId() == this.id);
		} else
			return false;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
