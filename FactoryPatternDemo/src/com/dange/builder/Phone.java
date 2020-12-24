package com.dange.builder;

public class Phone {
	
	String os;
	String processor;
	int ramSize;
	int batterySize;
	double price;

	public Phone(String os, String processor, int ramSize, int batterySize, double price) {
		super();
		this.os = os;
		this.processor = processor;
		this.ramSize = ramSize;
		this.batterySize = batterySize;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ramSize=" + ramSize + ", batterySize=" + batterySize
				+ ", price=" + price + "]";
	}
}
