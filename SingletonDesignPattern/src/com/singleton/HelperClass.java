package com.singleton;

public class HelperClass {
	private static int countofObjects=0;	
    private HelperClass(){countofObjects++;}
    
    private static class SingletonHelper{
        private static final HelperClass INSTANCE = new HelperClass();
    }
    
    public static HelperClass getInstance(){
        return SingletonHelper.INSTANCE;
    }
	public static void print() {System.out.println("SingletonClass count="+ countofObjects);}

}