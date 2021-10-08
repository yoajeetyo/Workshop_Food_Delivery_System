package com.bridgelabz.fooddeliverysystem;

import java.util.Objects;

public class FoodItems {
	@Override
	public int hashCode() {
		return Objects.hash(itemName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		return Objects.equals(itemName, other.itemName);
	}

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

	public void setTaste(Taste tasteChoice) {
		this.taste=tasteChoice;
		
	}

	public void setCatogery(Category catogeryChoice) {
		this.category = catogeryChoice;
		
	}

	public void setVegType(VegType vegTypeChoice) {
		this.vegType = vegTypeChoice;
		
	}
	
	public void setName(String itemName) {
		this.itemName = itemName;
		
	}

}
