package com.abstractPatternDemo;

public class ProfessionalResume extends ResumeTemplate {
	String resumeTitle;
	String candidateName;
	String candidateSkills;
	String candidateExperience;
	
	public ProfessionalResume(String resumeTitle, String candidateName, String candidateSkills,
			String candidateExperience) {
		super();
		this.resumeTitle = resumeTitle;
		this.candidateName = candidateName;
		this.candidateSkills = candidateSkills;
		this.candidateExperience = candidateExperience;
	}

	@Override
	public void printResumeTitle() {
		System.out.println("Title:"+ this.resumeTitle);
	}

	@Override
	public void printCandidateName() {
		System.out.println("Name :" + this.candidateName);
	}

	@Override
	public void printCandidateSkills() {
		System.out.println("Skills :" + this.candidateSkills);
	}

	@Override
	public void printCandidateExperience() {
		System.out.println("Experience" + this.candidateExperience);
	}

}
