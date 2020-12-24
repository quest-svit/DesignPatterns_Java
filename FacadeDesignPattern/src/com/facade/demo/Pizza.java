package com.facade.demo;

public class Pizza implements Food {

	String preparedPizza;
	
	@Override
	public void prepare(String ingrediants) {
		this.preparedPizza = "Pizza with " + ingrediants ;
	}

	@Override
	public String deliver() {
		// TODO Auto-generated method stub
		return preparedPizza;
	}

}
