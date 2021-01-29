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
        Item item3 = new Item("butter", 2.95);
        Item item4 = new Item("tomatoes", 0.99);
        Item item5 = new Item("asparagus", 1.31);
        
        // Create grocery items with the name, price per unit,
        // and quantity
        ItemOrder order1 = new ItemOrder(item1, 1);
        ItemOrder order2 = new ItemOrder(item2, 2);
        ItemOrder order3 = new ItemOrder(item3, 12);
        ItemOrder order4 = new ItemOrder(item4, 5);
        ItemOrder order5 = new ItemOrder(item5, 3);

        // Add grocery items to the grocery list object
        myCart.addItemToCart(order1);
        myCart.addItemToCart(order2);
        myCart.addItemToCart(order3);
        myCart.addItemToCart(order4);
        myCart.addItemToCart(order5);
        
        // Print the information about what's in our cart
        // and how much it costs
        myCart.printCart(myCart);
        
    }
}
