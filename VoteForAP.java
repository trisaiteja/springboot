package com;

import java.util.Scanner;

@CopyRight
public class VoteForAP {

	enum Vote {
		JSP, TDP, YCP, BJP, CNGRS, CPI, CPM, BSP;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chose any of the below party to vote: ");
		int count = 0;
		for (Vote v : Vote.values()) {
			count++;
			System.out.println(count + ". " + v);
		}

		System.out.println("*******************");
		System.out.println("Chose party: ");

		Vote choice = Vote.valueOf(scanner.next().toUpperCase());
		scanner.close();

		switch (choice) {
		case BJP:
			System.out.println("No more in South.");
			break;
		case CNGRS:
			System.out.println("No scope in AP.");
			break;
		case CPI:
			System.out.println("Friendly contest.");
			break;
		case CPM:
			System.out.println("Friendly contest.");
			break;
		case BSP:
			System.out.println("Friendly contest.");
			break;
		case JSP:
			System.out.println("Jai Janasena!!!!!!!!!!!");
			break;
		case TDP:
			System.out.println("Corrupted party in AP.");
			break;
		case YCP:
			System.out.println("Undefined.");
			break;
		default:
			System.out.println("NOTA");
			break;
		}
	}

}
