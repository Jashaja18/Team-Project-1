/*
 * Shreya Karnati, Ace Taniguchi, & Doris Sal y Rosas
 * Group #4
 * January 29, 2021
 * Team Project 1
 * Client to demonstrate use of shopping list classes
 */

public class ShoppingCartClient {

    public static void main(String[] args)
    {
        // Create list object
        ShoppingCart myCart = new ShoppingCart();
        
        // Creating items to buy
        Item item1 = new Item("cookies", 5.00);
        Item item2 = new Item("milk", 6.00);
        Item item2 = new Item("ice cream", 8.00);
        Item item2 = new Item("cake", 15.00);
        
        // Create grocery items with the name, price per unit,
        // and quantity per unit to account for bulk purchases
        ItemOrder order1 = new ItemOrder(item1, 10);
        ItemOrder order2 = new ItemOrder(item2, 1);
        ItemOrder order2 = new ItemOrder(item3, 2);
        ItemOrder order2 = new ItemOrder(item4, 1);

        // Add grocery items to the grocery list object
        myCart.addItemToCart(order1);
        myCart.addItemToCart(order2);
        
        // Printing oout all of the orders in a formated way
        myCart.printCart(myCart);
        
    }
}
