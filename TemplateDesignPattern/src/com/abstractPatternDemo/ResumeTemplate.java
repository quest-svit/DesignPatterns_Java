package com.abstractPatternDemo;

public abstract class ResumeTemplate {

	public abstract void printResumeTitle();
	public abstract void printCandidateName();	
	public abstract void printCandidateSkills();	
	public abstract void printCandidateExperience();
	
	public final void printResume() {
		printResumeTitle();
		printCandidateName();
		printCandidateSkills();
		printCandidateExperience();
	}



}
