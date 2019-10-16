package com;

import java.util.ArrayList;
import java.util.List;

@CopyRight
public class Something<T extends Number, E extends Employee> {
	T t;
	E e;

	Something() {
	}

	Something(T t, E e) {
		this.t = t;
		this.e = e;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public static List<Something<Integer, Employee>> getSomethingList(){
		List<Something<Integer, Employee>> list = new ArrayList<Something<Integer, Employee>>();
		Something<Integer, Employee> something = new Something<Integer, Employee>();
		something.setT(10);
		something.setE(new Employee(1, "Trisaiteja", "Narina", "9962040345", "Bhimavaram"));
		list.add(something);
		return list;
	}
	
	public T getTdata() {
		@SuppressWarnings("unchecked")
		T integer = (T) new Integer(10);
		return integer;
	}
	
	public static void main(String[] args) {
		List<Something<Integer, Employee>> list = getSomethingList();
		list.forEach(some -> System.out.println(some.getT()+" --> "+some.getE()));
		System.out.println(new Something<Integer, Employee>().getTdata());
	}
}
