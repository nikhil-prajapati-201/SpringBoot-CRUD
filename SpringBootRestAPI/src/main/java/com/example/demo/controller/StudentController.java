package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@RestController // to make controller write controller Annotation
public class StudentController {

	//get all the students
	@Autowired
	StudentRepository repo;
	//localhost:8080/students <--this is mu url for hiting this
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		List<Student> students = repo.findAll();
		return students;
	}
	
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student std = repo.findById(id).get();
		return std;
	}
	
	@PostMapping("/students/add")
	public String createStudent(@RequestBody Student student) {
		
		repo.save(student);
		return "Succesfull Added";
	}public StudentController() {
		// TODO Auto-generated constructor stub
	}
	@PutMapping("students/update/{id}")
	public Student updateStudents(@PathVariable int id) {
		Student std = repo.findById(id).get();
		std.setName("Badal");
		std.setPercentage(73);
		std.setBranch("Nursing");
		repo.save(std);
		return std;
	}

	@DeleteMapping("students/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		Student std = repo.findById(id).get();
		repo.delete(std);
		return "Student with id:"+id+" is Deleted Succesfully";
		
		
	}
}
