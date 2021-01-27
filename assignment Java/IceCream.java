package com.thinkitive.day4.assignment;

public class IceCream extends DessertItem {
	double cost;

	public IceCream() {
		super();
	}

	public IceCream(String name) {
		super(name);
		this.cost = 100;
	}

	@Override
	public double costOfItem() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}

class Sundae extends IceCream{
	double toppings_cost;
	public Sundae() {
		super();
	}
	public Sundae(String name) {
		super(name);
		this.toppings_cost=20;
	}
	@Override
	public double costOfItem() {
		// TODO Auto-generated method stub
		return super.costOfItem()+this.toppings_cost;
	}
}
