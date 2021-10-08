package com.bridgelabz.fooddeliverysystem;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// View layer
public class UserInterface {
	
	private static UserInterface instanceUserInterface;
	public void print(Set set) {
//		for (int i = 0; i < foodlist.size(); i++) {
//			System.out.println(foodlist.get(i));
//		}
//		foodlist.stream().forEach(foodItems -> System.out.println(foodItems));
		set.forEach(System.out::println);
	}
	
    private UserInterface() {
		// TODO Auto-generated constructor stub
	}
    
    public static synchronized UserInterface getInstance() {
		if (instanceUserInterface==null) {
			instanceUserInterface=new UserInterface();
		}
		return instanceUserInterface;
	}

	public void showUserMenu() {
		Scanner scanner=new Scanner(System.in);
		int n=0;
		int exit=5;
		Application application=new Application();
		
		while(n != exit) {
			System.out.println("Enter 1 for Adding food Item");
			System.out.println("Enter 2 for Removing food Item");
			System.out.println("Enter 3 for Printing food Item");
			System.out.println("Enter 4 for Edit the food Item");
			System.out.println("Enter 5 for Exit");
			n = scanner.nextInt();
			
			application.handleUserSelection(n);
		}
	}
	
	public FoodItems createItems() {
		FoodItems foodItems = new FoodItems();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the food item you want to add : ");
		String itemName=scanner.nextLine();
		foodItems.setName(itemName);
		System.out.println("Enter taste: \n1. for Spicy \n2. for Sweet \n3. Sour \n4. for Sweet_Sour ");
		int tasteChoice = scanner.nextInt();
		switch (tasteChoice) {
		case 1:
			foodItems.setTaste(FoodItems.Taste.SPICY);
			break;
			
		case 2:
			foodItems.setTaste(FoodItems.Taste.SWEET);
			break;
			
		case 3:
			foodItems.setTaste(FoodItems.Taste.SOUR);
			break;
			
		case 4:
			foodItems.setTaste(FoodItems.Taste.SWEET_SOUR);
			break;

		default:
			break;
		}
		
		System.out.println("Enter Catogery: \n1. for Starter \n2. for Juice \n3. Deserts \n4. for Main_Course ");
		int catogeryChoice = scanner.nextInt();
		switch (catogeryChoice) {
		case 1:
			foodItems.setCatogery(FoodItems.Category.STARTER);
			break;
			
		case 2:
			foodItems.setCatogery(FoodItems.Category.JUICE);
			break;
			
		case 3:
			foodItems.setCatogery(FoodItems.Category.DESERTS);
			break;
			
		case 4:
			foodItems.setCatogery(FoodItems.Category.MAIN_COURSE);
			break;

		default:
			break;
		}
		
		System.out.println("Enter Type: \n1. for Veg  \n2. for Non_veg");
		int vegChoice = scanner.nextInt();
		switch (vegChoice) {
		case 1:
			foodItems.setVegType(FoodItems.VegType.VEG);
			break;
			
		case 2:
			foodItems.setVegType(FoodItems.VegType.NON_VEG);
			break;
			
		}
		
		System.out.println("Enter the price of the item : ");
		int price = scanner.nextInt();
		foodItems.setPrice(price);
		return foodItems;
	}
	
	public FoodItems edit(FoodItems foodItem) {
        int flag = 0;
        while (flag == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("which field you want to edit\n1. for Name\n2. for Taste\n3. for Category\n4. for Type\n5. for price\n6. for exit\n=====>> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.print("\nEnter Item Name: ");
                    String itemName=sc.nextLine();
					foodItem.setName(itemName);
                    break;
                }
                case 2 : {
                    System.out.print("Enter taste: \n1. for Spicy \n2. for Sweet \n3. Sour \n4. for Sweet_Sour ");
                    int tasteChoice = sc.nextInt();
                    switch (tasteChoice) {
                        case 1 :
                        	foodItem.setTaste(FoodItems.Taste.SPICY);
                        	break;
                        case 2 : 
                        	foodItem.setTaste(FoodItems.Taste.SWEET);
                        	break;
                        case 3 :
                        	foodItem.setTaste(FoodItems.Taste.SOUR);
                        	break;
                        case 4 :
                        	foodItem.setTaste(FoodItems.Taste.SWEET_SOUR);
                        	break;
                        default : 
                        	System.out.println("plz enter correct choice........");
                        	break;
                    }
                }
                case 3 : {
                    System.out.print("Enter Catogery: \n1. for Starter \n2. for Juice \n3. Deserts \n4. for Main_Course ");
                    int categoryChoice = sc.nextInt();
                    switch (categoryChoice) {
                        case 1 :
                        	foodItem.setCatogery(FoodItems.Category.STARTER);
                        	break;
                        case 2 : 
                        	foodItem.setCatogery(FoodItems.Category.JUICE);
                        	break;
                        case 3 :
                        	foodItem.setCatogery(FoodItems.Category.DESERTS);
                        	break;
                        case 4 :
                        	foodItem.setCatogery(FoodItems.Category.MAIN_COURSE);
                        	break;
                        default : 
                        	System.out.println("plz enter correct choice........");
                        	break;
                    }
                }
                case 4 : {
                    System.out.print("Enter Type: \n1. for Veg  \n2. for Non_veg");
                    int type = sc.nextInt();
                    switch (type) {
                        case 1 : 
                        	foodItem.setVegType(FoodItems.VegType.VEG);
                        	break;
                        case 2 :
                        	foodItem.setVegType(FoodItems.VegType.NON_VEG);
                        	break;
                        default :
                        	System.out.println("plz enter correct choice........");
                        	break;
                    }
                }
                case 5 : {
                    System.out.print("Enter Price: Rs.");
                    int price = sc.nextInt();
                    foodItem.setPrice(price);
                    break;
                }
                case 6 : {
                    flag = 1;
                }
                default : 
                	break;
            }
        }
        System.out.println("\n success!!!Food item updated .......\n");
        return foodItem;
    }
}
