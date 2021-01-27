//Group # 4
//January 26,2021
//Get the shopping Cart.

import java.util.*;

public class ShoppingCart {
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
}
