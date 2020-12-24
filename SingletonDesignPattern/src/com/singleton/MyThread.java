package com.singleton;

public class MyThread implements Runnable{

	public MyThread() {
	}

	@Override
	public void run() {
		HelperClass obj = HelperClass.getInstance();
		obj.print();		
	}

}
