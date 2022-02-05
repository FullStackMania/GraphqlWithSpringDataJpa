package com.fullstackmania.graphql.Graphql.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.fullstackmania.graphql.Graphql.entity.StudentResponse;
import com.fullstackmania.graphql.Graphql.service.StudnetService;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	private StudnetService service;
	
	public StudentResponse student(Long id) {
		return new StudentResponse(service.getStudentById(id));
	}

}
