package com.dange.impl;

import com.dange.OperatingSystem;

public class IOS implements OperatingSystem {

	private String creator;
	
	public IOS() {
		this.creator="Apple";
	}

	@Override
	public void spec() {
		System.out.println("Suitable for Handheld devices and is supersecure");

	}

}
