/*
 * Shreya Karnati
 * January 22, 2021
 * Team Project 1
 * An item that can be purchased
 */

public class chips extends Item
{
    // Variables
    private String itemName = "chips";
    private double pricePerItem = "1.5"; 

    // Getting item information
    public String getItemName()
    {
        return itemName;
    }

    public double getPricePerItem()
    {
        return pricePerItem;
    }
}