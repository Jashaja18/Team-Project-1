/*
 * Group # 4
 * Team Project 1
 * January 29, 2021
 * Information about a specific item
 */

public class Item
{
    // Class variables
    private String itemName;
    private double pricePerItem;
    
    // Constructor
    public Item(String itemName, double pricePerItem)
    {
        this.itemName = itemName;
        this.pricePerItem = pricePerItem;
    }

    // Identifying the item
    public String getItemName()
    {
        return itemName;
    }

    // Price of the item
    public double getPrice() 
    {
        return pricePerItem;
    }

    // Used to print out information about the item
    public String toString()
    {
        return itemName + " are $" + pricePerItem;
    }

}
