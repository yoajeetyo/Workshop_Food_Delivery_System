package com.bridgelabz.fooddeliverysystem;

public class FoodItems {
	enum Taste {
		SWEET, SOUR, SPICY, SWEET_SOUR
	};

	enum Category {
		STARTER, JUICE, DESERTS, MAIN_COURSE
	};

	enum VegType {
		VEG, NON_VEG
	};

	protected Taste taste;
	protected Category category;
	protected VegType vegType;
	protected int price;
	protected String itemName;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItems [taste=" + taste + ", category=" + category + ", vegType=" + vegType + ", price=" + price
				+ ", itemName=" + itemName + "]";
	}

}
