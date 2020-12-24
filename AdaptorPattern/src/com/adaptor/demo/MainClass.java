package com.adaptor.demo;
import com.someother.demo.GelPen;

public class MainClass {

	public static void main(String[] args) {
		Assignment assignment  = new Assignment();
		Pen penadaptor = new PenAdaptor(new GelPen());
		assignment.setPen(penadaptor);
		
		
		assignment.writeAssignment("Physics assignment");
		assignment.writeAssignment("Maths assignment");
		assignment.writeAssignment("Chemistry assignment");
	}

}
