package com.bridgelabz.fooddeliverysystem;

import java.util.Scanner;

//Controller Layer

public class Application {
	FoodStore foodStore = new FoodStore();
	UserInterface userInterface = new UserInterface();
	
	public static void main(String[] args) {
		
		UserInterface userInterface = new UserInterface();
		userInterface.showUserMenu();
	}
	
	public void handleUserSelection(int n) {

		switch (n) {
		
		case 1:
			AppleJuice appleJuice = new AppleJuice();
			appleJuice.setPrice(100);
			HakkaNoodle hakkaNoodle = new HakkaNoodle();
			hakkaNoodle.setPrice(200);
			ItalianMomos italianMomos = new ItalianMomos();
			italianMomos.setPrice(300);
			MasalaDosa masalaDosa = new MasalaDosa();
			masalaDosa.setPrice(400);

			
			foodStore.add(appleJuice);
			foodStore.add(hakkaNoodle);
			foodStore.add(italianMomos);
			foodStore.add(masalaDosa);
			
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
        	 
			break;
		}
	}
}
