package com;

@CopyRight
public class StringReverse {

	public static void main(String[] args) {
		String s = "abc def ghi jkl mno pqr stu vwxyz";
		String[] s1 = s.split(" ");
		for (int i = s1.length-1; i >= 0; i--) {
			System.out.print(s1[i]+" ");
		}
		
		System.out.println();
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
