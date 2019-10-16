package com;

public class StringBufferBuilderExample {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = s1.append("hello");
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		System.out.println("s1 Ref: "+System.identityHashCode(s1));
		System.out.println("s2 Ref: "+System.identityHashCode(s2));
	}

}
