package com.singleton;

public class DoubleCheckSynchronized {

	private volatile static DoubleCheckSynchronized singletonObj;
	private static int countofObjects=0;
	
	private DoubleCheckSynchronized() {
		countofObjects++;
	}
	
	public static DoubleCheckSynchronized getInstance() {
		if (singletonObj == null) {
			synchronized(DoubleCheckSynchronized.class){
				if (singletonObj == null) {
					singletonObj = new DoubleCheckSynchronized();}
			}
		}
		return singletonObj;
	}
	
	public static void print() {System.out.println("SingletonClass count="+ countofObjects);}
	
}
