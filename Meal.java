package com.dp.creational.builder;

import java.util.ArrayList;
import java.util.List;

import com.CopyRight;

@CopyRight
public class Meal {

	List<Item> itemsList = new ArrayList<Item>();

	public void addItem(Item item) {
		itemsList.add(item);
	}

	public float getCost() {
		float cost = 0;
		for (Item item : itemsList) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : itemsList) {
			System.out.println(item.name() + ": " + item.price());
		}
	}
}
