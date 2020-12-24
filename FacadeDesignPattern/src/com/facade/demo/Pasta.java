package com.facade.demo;

public class Pasta implements Food {
	String preparedPasta;
	
	@Override
	public void prepare(String ingrediants) {
		this.preparedPasta = "Pasta with " + ingrediants;
	}

	@Override
	public String deliver() {
		// TODO Auto-generated method stub
		return preparedPasta;
	}	

}
