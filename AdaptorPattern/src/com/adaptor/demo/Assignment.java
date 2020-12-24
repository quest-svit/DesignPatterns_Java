package com.adaptor.demo;

public class Assignment {

	Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void writeAssignment(String message) {
		this.pen.write(message);
	}
	

}
