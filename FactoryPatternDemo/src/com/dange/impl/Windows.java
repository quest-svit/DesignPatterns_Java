package com.dange.impl;

import com.dange.OperatingSystem;

public class Windows implements OperatingSystem {

	private String creator;
	
	public Windows() {
		this.creator="Microsoft";
	}

	@Override
	public void spec() {
		System.out.println("Seamlessly integrates with PC");

	}

}
