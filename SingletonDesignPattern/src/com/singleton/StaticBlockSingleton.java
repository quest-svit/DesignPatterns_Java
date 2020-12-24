package com.singleton;

public class StaticBlockSingleton {
	private static int countofObjects=0;
	private static StaticBlockSingleton singletonObj;
	
	static{
        try{
        	singletonObj = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
	
	private StaticBlockSingleton() {
		countofObjects++;
	}
	
	public static  StaticBlockSingleton getInstance() {
		return singletonObj;
	}
	
	public static void print() {System.out.println("SingletonClass count="+ countofObjects);}
	
}