package com.infosys.example.dao;

import java.util.List;

import com.infosys.example.model.Student;

public interface StudentDao {
	public List<Student> getAllStudents();
	public Student getStudent(int id);
}
