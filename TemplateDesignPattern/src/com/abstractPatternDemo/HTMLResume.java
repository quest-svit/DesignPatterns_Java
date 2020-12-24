package com.abstractPatternDemo;

public class HTMLResume extends ResumeTemplate {
	String resumeTitle;
	String candidateName;
	String candidateSkills;
	String candidateExperience;
	
	public HTMLResume(String resumeTitle, String candidateName, String candidateSkills, String candidateExperience) {
		super();
		this.resumeTitle = resumeTitle;
		this.candidateName = candidateName;
		this.candidateSkills = candidateSkills;
		this.candidateExperience = candidateExperience;
	}

	@Override
	public void printResumeTitle() {
		System.out.println("<body>");
		System.out.println("<title>" +this.resumeTitle +  "</title>");
	}

	@Override
	public void printCandidateName() {
		System.out.println("<name>" + this.candidateName + "</name>");
	}

	@Override
	public void printCandidateSkills() {
		System.out.println("<skills>" + this.candidateSkills + "</skills>" );

	}

	@Override
	public void printCandidateExperience() {
		System.out.println("<experience>" + this.candidateExperience + "</experiene>");
		System.out.println("</body>");
	}

}
