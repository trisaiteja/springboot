package com;

@CopyRight(authorName = "Eshwaran")
public class RemoveDuplicateLettersWOUsingCollections {

	public static void swap(StringBuilder sb, int a, int b) {
		char temp = sb.charAt(a);
		sb.setCharAt(a, sb.charAt(b));
		sb.setCharAt(b, temp);
	}

	public static void main(String[] args) {
		String s = "asgdhsvbchadsgbfdgjsbajhbsjhsahgfhsgfcvasdbcvhwdz";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);
			Boolean found = false;
			for (int j = 0; j < sb.length(); j++) {
				if (inputChar == sb.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found) {
				sb.append(inputChar);
			}
		}
		System.out.println("Result after removing duplicates: " + sb);
		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) > sb.charAt(j)) {
					swap(sb, i, j);
				}
			}
		}
		System.out.println("Result sorted in ascending order: " + sb);

	}

}
