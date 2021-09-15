package com.bridgelabz.fooddeliverysystem;

import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// View layer
public class UserInterface {
	public void print(List<FoodItems> foodlist) {
		for (int i = 0; i < foodlist.size(); i++) {
			System.out.println(foodlist.get(i));
		}
	}

	public UserInterface() {
		// TODO Auto-generated constructor stub
	}

	public void showUserMenu() {
		Scanner scanner=new Scanner(System.in);
		int n=0;
		int exit=4;
		Application application=new Application();
		
		while(n != exit) {
			System.out.println("Enter 1 for Adding food item");
			System.out.println("Enter 2 for Removing food item");
			System.out.println("Enter 3 for Printing food item");
			System.out.println("Enter"+exit+ " for Exit");
			n = scanner.nextInt();
			
			application.handleUserSelection(n);
		}
	}
}
