package com.facade.demo;

public class MainClient {

	public static void main(String[] args) {
		/* //Without Facade
		Ingrediants ig =  new Ingrediants();		
		Food pizza = new Pizza();
		pizza.prepare(ig.getPizzaIngrediants());
		System.out.println(pizza.deliver());
		
		Food pasta = new Pasta();
		pasta.prepare(ig.getPastaIngrediants());
		System.out.println(pasta.deliver());*/

		//With Facace
		WaiterFacade w =  new WaiterFacade();
		System.out.println(w.getPizza());
		System.out.println(w.getPasta());

		
	}

}
