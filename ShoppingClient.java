
/*
 * Shreya Karnati, Ace Taniguchi, & Doris Sal y Rosas
 * Group #4
 * January 29, 2021
 * Team Project 1
 * Client to demonstrate use of shopping list classes
 */

public class ShoppingClient	{

	public static void main(String[] args)
    {

        // Create list object
        ShoppingCart myCart = new ShoppingCart();

        // Create grocery items with the name, price per unit, and quantity per unit to account for bulk purchases
        Item item1 = new Item("rice", 9.95, 2);
        Item item2 = new Item("beans", 5.95, 1);
        
        // Create item orders
        ItemOrder item1Order = new ItemOrder(item1, 5);
        ItemOrder item2Order = new ItemOrder(item2, 2);

        // Add grocery items to the grocery list object
        myCart.add(item1Order);
        myCart.add(item2Order);

        // Printing out each of the items in a formated way
        //System.out.println("Total = " + String.format("%.2f", myCart.getTotalPrice()));
        item1.printOrder();
        item2.printOrder();
    }

}
