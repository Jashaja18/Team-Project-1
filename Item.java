/*
 * Group # 4
 * Team Project 1
 * January 29, 2021
 * This class is used to contruct the items we will put in our shopping cart and purchase
 * Each Item has a name and price.

public class Item
{
    // Class variables
    private String itemName;
    private double pricePerItem;
    
    //constructor
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

    // How much the item costs
    public double getPrice() 
    {
        return pricePerItem;
    }

    // Return a string so that we can print the item and its price
    // in the shopping cart
    public String toString()
    {
        return itemName + " are $" + pricePerItem;
    }
}
