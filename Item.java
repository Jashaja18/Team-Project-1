
/*
 * Group # 4
 * Team Project 1
 * January 21, 2021
 * [info]
 */

public class Item
{
    // Class variables
    private String itemName;
    private double pricePerItem;
    private int quantity;
    
    // Constructor
    public Item(String itemName, double pricePerItem, int quantity)
    {
        // Calling setItem method
        setItem(itemName, pricePerItem, quantity);
    }

    // Method definition
    public void setItem(String itemName, double pricePerItem, int quantity)
    {
        this.itemName = itemName;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    // Identifying the item
    public String getItemName()
    {
        return itemName;
    }

    // Getting the price of items
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    
    // Standard java toString to print out name and quantity of grocery item 
	public String toString()
	{
		return quantity + " of " + itemName;
	}

	// Getter of item name
	public String getitemName()
	{
		return this.itemName;
	}
}
