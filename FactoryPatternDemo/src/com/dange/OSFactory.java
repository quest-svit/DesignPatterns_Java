package com.dange;

import com.dange.impl.*;

public class OSFactory {

	public OSFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public OperatingSystem getInstance(String osname) {
		if (osname.equals("Android")) { return new Android();}

		if (osname.equals("IOS")) { return new IOS();}
		
		if (osname.equals("Windows")) { return new Windows();}
		
		return null;


	}
}
