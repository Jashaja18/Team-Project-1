/*
 * Group # 4
 * Team Project 1
 * January 29, 2021
 * This class constructs the items we wish to add to our shopping cart and buy.
 * Each item has a name and a price.

public class Item
{
    // Class variables
    private String itemName;
    private double pricePerItem;
    
    //constructor, with name and price of item
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

    public double getPrice() 
    {
        return pricePerItem;
    }

    // Lets us print the item's name and price/
    public String toString()
    {
        return itemName + " are $" + pricePerItem;
    }
}
