package com.fullstackmania.graphql.Graphql.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.fullstackmania.graphql.Graphql.entity.StudentResponse;
import com.fullstackmania.graphql.Graphql.entity.Subject;
import com.fullstackmania.graphql.Graphql.entity.SubjectResponse;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {
	
	public List<SubjectResponse> getSubjects(StudentResponse studentResponse) {
		List<SubjectResponse> subjects = new ArrayList<SubjectResponse>();
		if(studentResponse.getStudent().getSubjects() != null) {
			for(Subject subject : studentResponse.getStudent().getSubjects()) {
				subjects.add(new SubjectResponse(subject));
			}
		}
		return subjects;
	}
	

}
