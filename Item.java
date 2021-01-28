
/*
 * Group # 4
 * Team Project 1
 * January 29, 2021
 * [info]
 */

public class Item
{
	// Class variables
	private String itemName;
	private double pricePerItem;
	private int allQuantity;

	// Method definition
	public void setItem(String itemName, double pricePerItem, int allQuantity)
	{
		this.itemName = itemName;
		this.pricePerItem = pricePerItem;
		this.allQuantity = allQuantity;
	}

	// Identifying the item
	public String getItemName()
	{
		return itemName;
	}

	public void setQuanity(int allQuantity)
	{
		this.allQuantity = allQuantity;
	}

	public double getPrice() 
	{
		return pricePerItem;
	}

	public String toString()
	{
		return itemName + " are " + pricePerItem + " per " + allQuantity;
	}
}
