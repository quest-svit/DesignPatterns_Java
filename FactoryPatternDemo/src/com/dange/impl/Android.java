package com.dange.impl;

import com.dange.OperatingSystem;

public class Android implements OperatingSystem{
	
	private String creator;

	public Android() {
		this.creator="Google";
	}

	@Override
	public void spec() {
		System.out.println("Suitable for Handheld devices");
		
	}

}
