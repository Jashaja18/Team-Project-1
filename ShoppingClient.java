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
        
        Item item1 = new Item("cookies", 5.00);
        Item item2 = new Item("milk", 6.00);
        
        // Create grocery items with the name, price per unit,
        // and quantity per unit to account for bulk purchases
        ItemOrder order1 = new ItemOrder(item1, 1);
        ItemOrder order2 = new ItemOrder(item2, 2);

        // Add grocery items to the grocery list object
        myCart.addItemToCart(order1);
        myCart.addItemToCart(order2);
        
        myCart.printCart(myCart);
        
    }
}
