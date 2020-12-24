package com.adaptor.demo;
import com.someother.demo.GelPen;

public class PenAdaptor implements Pen {
	GelPen gelpen;
	
	PenAdaptor(GelPen gp){this.gelpen =  gp;}

	@Override
	public void write(String message) {
		this.gelpen.mark(message);
	}
	

}
