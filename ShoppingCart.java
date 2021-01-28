
/*
 * Group 4
 * January 29, 2021
 * Team Project 1
 * [info]
 */

import java.util.*;

public class ShoppingCart {

	// Creating the array list used
	private ArrayList<ItemOrder> cart = new ArrayList<>();
	
	public ShoppingCart() {
		
	}
	
	public double getTotalPrice() {
		double total = 0.0;
		for (int i = 0; i < cart.size(); i++) {
			ItemOrder order = cart.get(i);
			total += order.getOrderPrice();
		}
		return total;
	}
	
	public void add (ItemOrder order) {
		cart.add(order);
	}
	
	public void remove (ItemOrder order) {
		cart.remove(order);
	}
	
	public boolean search(ItemOrder Order) {
	  boolean found = false;
	  
	   for(int index = 0; index < cart.size(); index++) {
		   
		if (Order.equals(cart.get(index)))
		found = true;
		
	   }
	    return found;
	}

	// Printing out all of the item orders
	public void printOrders()
    {
        for (int i = 0; i < cart.lenght(); i++)
        {
            System.out.println(cart[i].toString() + " " + cart[i].getCost());
        }
    }
}
