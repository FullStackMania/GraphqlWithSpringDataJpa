package com.fullstackmania.graphql.Graphql.entity;

public class SubjectResponse {

	private Long id;

	private String subjectName;

	private double marks;

	public SubjectResponse(Subject subject) {

		this.id = subject.getId();
		this.subjectName = subject.getSubjectName();
		this.marks = subject.getMarksObtained();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
