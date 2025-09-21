package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

//	JpaRepository -- we will implements this interface for because in this all method have for CRUD tasks
}
