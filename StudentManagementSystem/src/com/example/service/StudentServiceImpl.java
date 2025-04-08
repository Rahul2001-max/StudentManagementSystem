package com.example.service;

import java.util.List;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.model.StudentBean;

public class StudentServiceImpl implements StudentService{

	StudentDao studentDao = new StudentDaoImpl();
	@Override
	public boolean saveUser(StudentBean studentBean) {
		
		boolean isSaved = studentDao.saveStudent(studentBean);
		return isSaved;
	}
	
	public List<StudentBean> getAllStudent()
	{
		List<StudentBean> students = studentDao.getAllStudent();
		return students;
	}
	
	public boolean getStudentByEmail(String email)
	{
		return studentDao.getStudentByEmail(email);
	}
	
	public StudentBean getStudentById(int id) {
		StudentBean student = studentDao.getStudentById(id);
		return student;
	}
	
	public boolean updateStudent(StudentBean student) {
		boolean status = studentDao.updateStudent(student);
		return status;
	}
	
	public boolean removeStudent(StudentBean studentBean) {
		boolean isDeleted = studentDao.removeStudent(studentBean);
		
		return isDeleted;
	}
}
