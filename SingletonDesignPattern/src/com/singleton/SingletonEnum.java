package com.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	private static int countofObjects=0;
	static
	{countofObjects++;}
	
	public void print() {System.out.println("SingletonEnum count="+ countofObjects);}
	
	public static SingletonEnum getInstance() {return INSTANCE;}

}
