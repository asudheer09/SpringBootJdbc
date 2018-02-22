package com.infosys.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.example.dao.StudentDaoImpl;
import com.infosys.example.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired 
public StudentDaoImpl dao;

@Override
public List<Student> getAllStudents() {
	return dao.getAllStudents();
}
@Override
public Student getStudent(int id) {
	return dao.getStudent(id);
}
}
