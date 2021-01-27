package com.thinkitive.day4.assignment;

public class TestCheckout {

	public static void main(String[] args) {
		Candy candy = new Candy("Orange Candy", 240);
		Cookie cookie = new Cookie("Chocolate Cookie", 10);
		IceCream iceCream = new IceCream("vanilla");
		Sundae sundae = new Sundae("vanilla with oregano");
		
		DessertItem item[] = {sundae,iceCream,cookie,candy};
		Checkout cartCheckout = new Checkout();
		cartCheckout.addItems(item);
		System.out.println(cartCheckout);
		
	}

}
