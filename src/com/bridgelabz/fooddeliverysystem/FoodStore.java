package com.bridgelabz.fooddeliverysystem;
//Data layer or model Layer

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FoodStore {
	
	private static FoodStore instanceFoodStore;
	private List<FoodItems> foodlist = new ArrayList();
	
	private FoodStore() {
		
	}
	
	public static synchronized FoodStore getInstance() {
		if (instanceFoodStore==null) {
			instanceFoodStore=new FoodStore();
		}
		return instanceFoodStore;
	}

	public void add(FoodItems foodItems) {
		foodlist.add(foodItems);
	}

	public void remove(FoodItems foodItems) {
		foodlist.remove(foodItems);
	}

	public List getFoodList() {
		return foodlist;
	}
	
	public FoodItems getFoodItem(String foodName) {
		for (FoodItems foodItems : foodlist) {
			if (foodName.equals(foodItems.itemName)) {
				return foodItems;
			}
		}
		return null;
	}
}
