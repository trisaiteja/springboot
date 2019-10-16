package com;

public class Test {

	public static void main(String[] args) {
		String s = "sjfsnkjfnksdnfns";
		char[] ch = s.toCharArray();
		char[] result = new char[ch.length];
		int j = 1;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ch[i++]) {
				result[j++] = ch[i];
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

}
