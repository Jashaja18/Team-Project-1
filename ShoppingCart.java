/*
 * Shreya Karnati
 * Group #4
 * January 29, 2021
 * Team Project 1
 * This is the shopping cart, where all the items, in the quantities we wish to purchase,
 * are gathered together in an arraylist and the total costs are calculated

import java.util.*;

public class ShoppingCart{

	private ArrayList<ItemOrder> fullCart = new ArrayList<ItemOrder>();

	// default constuctor
	public ShoppingCart() {}

	// this will get the total cost of the cart
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
	
	// Method to add items to cart
	public void addItemToCart(ItemOrder orderIt)
	{
		fullCart.add(orderIt);
	}

	// Method to remove items from cart
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

	// standard Java toString
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
