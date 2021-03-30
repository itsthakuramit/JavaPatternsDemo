package com.stackroute.patterns.factory;


public class PizzaFactory{

	public enum PizzaType{
		ChickenPizza,
		VegPizza;
		
	}
	
	public static Pizza createPizza(PizzaType type) {
		
		switch (type) {
		case ChickenPizza:
			return new ChickenPizza();
		default:
			return new VegPizza();
		}
		
		
	}

	
	
    
}
