package com.singleton;

import java.io.Serializable;

public class EagerInitialization implements Cloneable,Serializable {
	
	private static final long serialVersionUID = 1L;
	private static int countofObjects=0;
	private static EagerInitialization singletonObj= new EagerInitialization();
	
	private EagerInitialization() {
		countofObjects++;
	}
	
	public static  EagerInitialization getInstance() {
		return singletonObj;
	}
	
	public static void print() {System.out.println("SingletonClass count="+ countofObjects);}
	
	public Object clone()throws CloneNotSupportedException{  
		return getInstance();
		}  
	
	protected Object readResolve(){return getInstance();}
}