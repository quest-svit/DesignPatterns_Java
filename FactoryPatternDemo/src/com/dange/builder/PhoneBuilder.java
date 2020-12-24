package com.dange.builder;

public class PhoneBuilder {
	
	String os;
	String processor;
	int ramSize;
	int batterySize;
	double price;

	public PhoneBuilder() {
		// TODO Auto-generated constructor stub
	}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}

	public PhoneBuilder setBatterySize(int batterySize) {
		this.batterySize = batterySize;
		return this;
	}

	public PhoneBuilder setPrice(double price) {
		this.price = price;
		return this;
	} 

	public Phone getPhone() {
		return new Phone(os , processor,ramSize,batterySize,price);
	}
}
