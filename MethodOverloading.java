package com;

public class MethodOverloading extends Parent1 {
	
	public static void main(String[] args) {
		System.out.println("main in Test");
		
		int[] i = new int[3];
		i[0] = 0;
		i[1] = 1;
		i[2] = 2;
		Parent1.main(i);
	}
}
