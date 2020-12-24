package com.facade.demo;

public class WaiterFacade {
	Ingrediants ig;
	Food pizza;
	Food pasta;
	
	WaiterFacade(){
		this.ig = new Ingrediants();
		this.pizza = new Pizza();
		this.pasta =  new Pasta();
	}

	public String getPizza() {
		pizza.prepare(ig.getPizzaIngrediants());
		return pizza.deliver();
	}
	
	public String getPasta() {
		pasta.prepare(ig.getPastaIngrediants());
		return pasta.deliver();
	}
}
