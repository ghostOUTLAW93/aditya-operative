package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Student;

public class StudentDAOImpl implements StudentDAO {

	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student stu) {
		String query= "insert into user_data(id,name)value(?,?)";
		int r = this.jdbcTemplate.update(query,stu.getId(),stu.getName());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		String query = "select * from user_data where id=?";
				RowMapper<Student> rm = new RowMapperImpl();
		Student s = this.jdbcTemplate.queryForObject(query, rm, sid);
		return s;
	}
	
	public List<Student> getAllStudent(){
		String query  = "select * from user_data";
		RowMapper<Student> rm = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, rm);
		return students;
	}

	

	}
