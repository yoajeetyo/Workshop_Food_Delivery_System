package com.bridgelabz.fooddeliverysystem;
//Data layer or model Layer

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class FoodStore {
	
	private static FoodStore instanceFoodStore;
	private Set<FoodItems> foodlist = new HashSet();
	
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

	public Set getFoodList() {
		return foodlist;
	}
	
	public FoodItems getFoodItem(String foodName) {
//		for (FoodItems foodItems : foodlist) {
//			if (foodName.equals(foodItems.itemName)) {
//				return foodItems;
//			}
//		}
//		return null;
	return  foodlist.stream().filter(fooditem->foodName.equals(fooditem.itemName)).findFirst().orElse(null);

	}
}
