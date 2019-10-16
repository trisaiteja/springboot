package com;

import java.util.Enumeration;
import java.util.Vector;

@CopyRight
public class EnumerationIterator {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");

		Enumeration<String> en = list.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
			list.removeAll(list);
		}
	}
}
