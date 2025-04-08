package com.example.service;

import java.util.List;

import com.example.model.StudentBean;

public interface StudentService {
	
	public boolean saveUser(StudentBean studentBean);
	public List<StudentBean> getAllStudent();
	public boolean getStudentByEmail(String email);
	public boolean updateStudent(StudentBean student);
	public StudentBean getStudentById(int id);
	public boolean removeStudent(StudentBean studentBean);
}
