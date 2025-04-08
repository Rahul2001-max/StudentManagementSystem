package com.example.dao;

import java.util.List;

import com.example.model.StudentBean;

public interface StudentDao {
	public boolean saveStudent(StudentBean studentBean);
	public List<StudentBean> getAllStudent();
	public boolean getStudentByEmail(String email);
	public StudentBean getStudentById(int id);
	public boolean updateStudent(StudentBean student);
	public boolean removeStudent(StudentBean studentBean);
}
