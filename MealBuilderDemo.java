package com.dp.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CopyRight;

@CopyRight
public class MealBuilderDemo {

	public static float calculateTax(float totalBill) {
		return (totalBill * 18) / 100;
	}

	public static void displayItems() {
		System.out.println("***************************************************************Welcome to Just-Eat Restaurent*******************************************************************\n");
		System.out.println("Please chose the items from the below menu using name: ");
		System.out.println("\nVeg:");
		System.out.println("\t1.VegSoup\n\t2.VegStarter\n\t3.VegBiryani\n\t4.Sprite\n");
		System.out.println("Non-Veg:");
		System.out.println("\t1.NonVegSoup\n\t2.NonVegStarter\n\t3.NonVegBiryani\n\t4.ThumsUp");
	}

	public static List<String> readItems() {
		List<String> itemsList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the number of items you will chose: ");
		int n = scanner.nextInt();
		System.out.println("\nPlease chose the items:");
		String item = "";
		for (int i = 0; i < n; i++) {
			item = scanner.next();
			itemsList.add(item);
		}
		scanner.close();
		return itemsList;
	}

	public static void main(String[] args) {
		MealBuilder mealBuilder = MealBuilder.getInstance();
		displayItems();
		List<String> itemsList = readItems();
		Meal vegMeal = mealBuilder.prepareVegMeal(itemsList);
		System.out.println("\nVeg Meal: ");
		vegMeal.showItems();
		System.out.println("Veg Bill: " + vegMeal.getCost() + "\n");

		System.out.println("*****************************************");

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal(itemsList);
		System.out.println("\nNon-Veg Meal: ");
		nonVegMeal.showItems();
		System.out.println("Non-Veg Bill: " + nonVegMeal.getCost());
		System.out.println("\nCGST: " + calculateTax((vegMeal.getCost() + nonVegMeal.getCost())) / 2);
		System.out.println("\nSGST: " + calculateTax((vegMeal.getCost() + nonVegMeal.getCost())) / 2);
		System.out.println("\nTotal Bill: " + (vegMeal.getCost() + nonVegMeal.getCost()
				+ calculateTax((vegMeal.getCost() + nonVegMeal.getCost()))));
		System.out.println("\nThanks for visting !");
	}
}
