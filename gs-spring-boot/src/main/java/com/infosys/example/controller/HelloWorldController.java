package com.infosys.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.example.model.Student;
import com.infosys.example.service.StudentServiceImpl;

@RestController
public class HelloWorldController {
	
	@Autowired
	public StudentServiceImpl service;
	
	@RequestMapping("/")
	public String helloWorld(){
		return "Hello service";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
	@RequestMapping(value="all")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@RequestMapping(value="student/{id}")
	public Student getStudent(@PathVariable("id") int id){
		return service.getStudent(id);
	}
}
