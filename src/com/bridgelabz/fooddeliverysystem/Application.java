package com.bridgelabz.fooddeliverysystem;

import java.util.Scanner;

//Controller Layer

public class Application {
	FoodStore foodStore = FoodStore.getInstance();
	UserInterface userInterface = UserInterface.getInstance();

	public static void main(String[] args) {
		UserInterface userInterface = UserInterface.getInstance();
		userInterface.showUserMenu();
	}

	public void handleUserSelection(int n) {

		switch (n) {

		case 1:
			FoodItems foodItems1 = userInterface.createItems();
			foodStore.add(foodItems1);
			break;

		case 2:
			System.out.println("Enter the food item you want to Remove");
			Scanner scanner = new Scanner(System.in);
			String foodName = scanner.nextLine();
			FoodItems foodItems = foodStore.getFoodItem(foodName);
			foodStore.remove(foodItems);
			break;

		case 3:
			System.out.println("Your food items are : ");
			userInterface.print(foodStore.getFoodList());
			break;

		case 4:
			 System.out.println("Enter the name which you want to edit: ");
             String name = new Scanner(System.in).nextLine();
             FoodItems food = foodStore.getFoodItem(name);
             userInterface.edit(food);
			break;
			
		case 5:
			break;
		}
	}
}
