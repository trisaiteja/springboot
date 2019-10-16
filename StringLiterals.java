package com;

public class StringLiterals {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1;
		String s3 = s1.concat(s2);
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		System.out.println("s1 Ref: "+System.identityHashCode(s1));
		System.out.println("s2 Ref: "+System.identityHashCode(s2));
		System.out.println("s3 Ref: "+System.identityHashCode(s3));
	}

}
