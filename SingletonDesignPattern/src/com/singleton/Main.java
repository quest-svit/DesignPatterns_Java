package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.time.Instant;

public class Main{

	public static void main(String[] args) {
		
		try {
			checkThreadSafefy();
			checkReflectionSafety();
			checkSerializationSafety();
			checkCloneSafety();
		} catch (ClassNotFoundException | IOException e1) {
			e1.printStackTrace();
		}
    }
		
		
	
	
	public static void checkThreadSafefy() {
		Long startTime = Instant.now().toEpochMilli();
		for (int i=0; i<20;i++) {		
			new Thread(new MyThread()).start();
		}
		Long endTime = Instant.now().toEpochMilli();
		System.out.println("Total Time elapsed="+ (endTime-startTime));
	}
	
	public static void checkReflectionSafety() {
		EagerInitialization instanceOne = EagerInitialization.getInstance();
		EagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());	
	}
	
	
	public static void checkSerializationSafety() throws FileNotFoundException, IOException, ClassNotFoundException {
    	EagerInitialization instanceOne = EagerInitialization.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        EagerInitialization instanceTwo = (EagerInitialization) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }
	
	public static void checkCloneSafety() {
		try {
			EagerInitialization instanceOne = EagerInitialization.getInstance();
			EagerInitialization instanceTwo = (EagerInitialization) instanceOne.clone();
			
			System.out.println(instanceOne.hashCode());
		    System.out.println(instanceTwo.hashCode());	
		        
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}