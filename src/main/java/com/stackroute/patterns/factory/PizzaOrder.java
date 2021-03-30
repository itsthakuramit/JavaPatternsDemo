package com.stackroute.patterns.factory;


public class PizzaOrder{

	public static void main(String[] args) {
		
		for(PizzaFactory.PizzaType pt: PizzaFactory.PizzaType.values()) {
			System.out.println(PizzaFactory.createPizza(pt).getPrice());
		}
		
	}

	
	
    
}
