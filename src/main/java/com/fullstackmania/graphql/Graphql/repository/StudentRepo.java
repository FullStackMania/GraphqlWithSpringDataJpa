package com.fullstackmania.graphql.Graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackmania.graphql.Graphql.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
