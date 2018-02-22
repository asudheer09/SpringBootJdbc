package com.infosys.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.example.model.Student;
import com.infosys.example.model.StudentRowMapper;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> getAllStudents() {
		String sql="select * from student";
		return this.jdbcTemplate.query(sql, new StudentRowMapper());
	}
	public Student getStudent(int id) {
		String sql="select * from student where id=?";
		return this.jdbcTemplate.queryForObject(sql, new StudentRowMapper(),id);
	}

}
