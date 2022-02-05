package com.fullstackmania.graphql.Graphql.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentResponse {
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private List<SubjectResponse> subjects;
	
	private Student student;
	
	public StudentResponse(Student student) {
		this.student = student;
		this.id = student.getId();
		this.email = student.getEmail();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		
		/*if(student.getSubjects() != null) {
			subjects = new ArrayList<SubjectResponse>();
			for(Subject subject : student.getSubjects()) {
				this.subjects.add(new SubjectResponse(subject));
			}
		}*/
		
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<SubjectResponse> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectResponse> subjects) {
		this.subjects = subjects;
	}

}
