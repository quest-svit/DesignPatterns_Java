package com.dange;

import com.dange.builder.Phone;
import com.dange.builder.PhoneBuilder;

public class Main {

	public static void main(String[] args) {
		
		Phone p = new PhoneBuilder().setBatterySize(3100).setOs("Android").setPrice(5999.95).setRamSize(4).getPhone();
		System.out.println(p);

		
		/*	OSFactory osf =  new OSFactory();
		OperatingSystem os = osf.getInstance("Android");
		os.spec();
*/
	}

}
