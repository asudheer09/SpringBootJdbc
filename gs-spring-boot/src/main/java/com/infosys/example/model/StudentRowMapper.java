package com.infosys.example.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>
{
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Student s = new Student();
        s.setEmpno(rs.getInt("id"));
        s.setName(rs.getString("name"));
        s.setCourse(rs.getString("course"));
        return s;
    }
}