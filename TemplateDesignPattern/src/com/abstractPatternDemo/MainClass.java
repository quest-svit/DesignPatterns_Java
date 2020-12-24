package com.abstractPatternDemo;

public abstract class MainClass {

	public static void main(String[] args) {
		ResumeTemplate resume = new ProfessionalResume("Java Full Stack Developer","Tanmay","Core Java/C++","9 years");
		resume.printResume();
		
		System.out.println("\n");
		
		ResumeTemplate htmlResume = new HTMLResume("Java Full Stack Developer","Tanmay","Core Java/C++","9 years");
		htmlResume.printResume();

	}

}
