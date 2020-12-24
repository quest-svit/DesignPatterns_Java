package com.singleton;

public class LazyInitialization {
	private static LazyInitialization singletonObj;
	private static int countofObjects=0;	
	private LazyInitialization() {countofObjects++;}
	
//There is no synchronized so not thread-safe
	public static LazyInitialization getInstance() { 
		if (singletonObj == null) {
			singletonObj = new LazyInitialization();
		}
		return singletonObj;
	}

	public static void print() {System.out.println("SingletonClass count="+ countofObjects);}
}
