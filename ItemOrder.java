/*
 * Thais Ribeiro & Shreya Karnati
 * Group #4
 * January 29, 2021
 * Team Project 1
 * Constructs an order of each purchased item.
 * Calculates the total price of each item and of the entire shopping cart,
 * accounting for bulk discounts for purchases of 10 or more

public class ItemOrder{

	// Creating variables needed
	private int allQuantity;
	private Item item;

	// Information needed for an order
	public ItemOrder(Item item, int allQuantity)
	{
		this.allQuantity = allQuantity;
		this.item = item;
	}

	// Used when the quantity of items is needed
	public int getQuantity()
	{
		return allQuantity;
	}

	//getter for item
	public Item getItem()
	{
		return item;
	}

	// Set quantity price
	public void setallQuantity(int allQuantity)
	{
		this.allQuantity = allQuantity;
	}

	// Calculates the total price of the order
	// Includes a bulk discount
	public double getOrderTotal()
	{
		double orderTotal = 0.00;
		// If we purchase more than 10 of an object we get about 79% off
		if (allQuantity >= 10)
		{
			for (int i = allQuantity; i > 10; i--)
				orderTotal += item.getPrice();
			return orderTotal + 7.5 * item.getPrice();

		} else {
			return orderTotal + item.getPrice() * allQuantity;
		}
	}
}
