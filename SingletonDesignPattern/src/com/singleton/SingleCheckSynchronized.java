package com.singleton;

public class SingleCheckSynchronized {

	private static SingleCheckSynchronized singletonObj;
	private static int countofObjects=0;
	
	private SingleCheckSynchronized() {
		countofObjects++;
	}
	
	public static synchronized  SingleCheckSynchronized getInstance() {
		if (singletonObj == null) {
			singletonObj = new SingleCheckSynchronized();
		}
		return singletonObj;
	}
	
	public static void print() {System.out.println("SingletonClass count="+ countofObjects);}
	
}