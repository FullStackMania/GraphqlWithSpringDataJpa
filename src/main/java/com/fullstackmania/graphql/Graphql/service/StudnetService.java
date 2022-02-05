package com.fullstackmania.graphql.Graphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackmania.graphql.Graphql.entity.Student;
import com.fullstackmania.graphql.Graphql.repository.StudentRepo;

@Service
public class StudnetService {
	
	@Autowired
	private StudentRepo repo;

	public Student getStudentById(Long id) {
		return repo.findById(id).get();
	}

}
