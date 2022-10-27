package com.dao;

import com.pojo.Student;

public interface StudentDAO {

	public int insert(Student st);
//	insert
//	edit
//	delete
	public Student getStudent(int sid);
}
