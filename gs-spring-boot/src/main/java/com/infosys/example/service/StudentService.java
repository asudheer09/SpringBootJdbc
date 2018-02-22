package com.infosys.example.service;


import java.util.List;

import com.infosys.example.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student getStudent(int id);
}

