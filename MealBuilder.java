package com.dp.creational.builder;

import java.util.List;

import com.CopyRight;

@CopyRight
public class MealBuilder {

	private static MealBuilder instance = new MealBuilder();

	private MealBuilder() {
	}

	public static MealBuilder getInstance() {
		synchronized (instance) {
			if (instance != null) {
				return instance;
			} else {
				return null;
			}
		}
	}

	public Meal prepareVegMeal(List<String> items) {
		Meal meal = new Meal();
		for (String item : items) {
			switch (item) {
			case "VegSoup":
				meal.addItem(new VegSoup());
				break;
			case "VegStarter":
				meal.addItem(new VegStarter());
				break;
			case "VegBiryani":
				meal.addItem(new VegBiryani());
				break;
			case "Sprite":
				meal.addItem(new Sprite());
				break;
			default: String vegMeal = "";
			}
		}

		return meal;
	}

	public Meal prepareNonVegMeal(List<String> items) {
		Meal meal = new Meal();
		for (String item : items) {
			switch (item) {
			case "NonVegSoup":
				meal.addItem(new NonVegSoup());
				break;
			case "NonVegStarter":
				meal.addItem(new NonVegStarter());
				break;
			case "NonVegBiryani":
				meal.addItem(new NonVegBiryani());
				break;
			case "ThumsUp":
				meal.addItem(new ThumsUp());
				break;
			default: String s = "";
			}
		}
		return meal;
	}

}
