/*
 * Shreya Karnati
 * Group #4
 * January 29, 2021
 * Team Project 1
 * A class that stores all of the items ordered
 */

import java.util.*;

public class ShoppingCart{

	// Array list to hold all of the orders
	private ArrayList<ItemOrder> fullCart = new ArrayList<ItemOrder>();

	// Constuctor
	public ShoppingCart() {}

	// Total price of everything ordered
	public double getTotalPrice()
	{
		double total = 0.0;
		for (int i = 0; i < fullCart.size(); i++)
		{
			ItemOrder item = fullCart.get(i);
			total += item.getOrderTotal();
		}
		return total;
	}

	// Adding an item to the cart
	public void addItemToCart(ItemOrder orderIt)
	{
		fullCart.add(orderIt);
	}

	// Removing an item from the cart
	public void removeFromCart(ItemOrder orderIt)
	{
		fullCart.remove(orderIt);
	}

	// This is used to search the item in the cart
	public boolean searchCart(ItemOrder orderSearch)
	{
		boolean itemFound = false;
		for(int j = 0; j < fullCart.size(); j++)
		{
			if (orderSearch.equals(fullCart.get(j)))
			{
				itemFound = true;
			}
		}
		return itemFound;
	}

	// Printing out all of the iteams in the cart in a formatted way
	public void printCart(ShoppingCart cart)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Your cart: ");
		for(ItemOrder i: fullCart)
		{
			System.out.print(i.getQuantity() + " units " + i.getItem().getItemName());
			for (int x = 20; x > i.getItem().getItemName().length(); x--) 
			{
				System.out.print(".");
			}
			
			System.out.print("$" + i.getOrderTotal());
			System.out.println();

			/*        	if (i.getQuantity() < 10) {
        		System.out.println("Would you like to purchase " + (10 - i.getQuantity()) + 
        				" more units to receive a 25% discount on the 10 units? (Reply y/n)");
        		String answer = input.nextLine();
        		if (answer == "y") {
        			i.setallQuantity(10);
        		}
        	}
			 */

		}
		System.out.println("Total Price: $" + cart.getTotalPrice());
	}
	
}
