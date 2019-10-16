package com;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@CopyRight
public class FailFastVsFailSafe {

	public static void main(String[] args) {
		Set<String> list = new CopyOnWriteArraySet<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		list.forEach(s -> {
			list.add("Four");
			System.out.println(s);
		});
		
		System.out.println(list);
	}

}
