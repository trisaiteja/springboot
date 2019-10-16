package com;

@CopyRight
public class RemoveEscapeSequences {

	public static void main(String[] args) {
		String s = "asjkdhasdbfk\njsdhfhdkjhf";
		if(s.contains("\n")) {
			System.out.println(s.replaceAll("\n", ""));
		}
	}

}
