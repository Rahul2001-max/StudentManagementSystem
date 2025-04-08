package com.example.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.model.StudentBean;

public class StudentDaoImpl implements StudentDao{

	private Configuration cf = new Configuration().configure("hibernate.cfg.xml");
	private SessionFactory sf = cf.buildSessionFactory();
	Transaction tx = null;
	@Override
	public boolean saveStudent(StudentBean studentBean) {
		Session session = sf.openSession();
		
		
		int isSaved =(int)session.save(studentBean);
		session.beginTransaction().commit();
		session.close();
		if(isSaved > 0)
			return true;
		return false;
	}

	@Override
	public List<StudentBean> getAllStudent() {
		Session session = sf.openSession();
		List<StudentBean> list = session.createQuery("from StudentBean", StudentBean.class).list();
		session.close();
		return list;
	}
	
	
	public boolean getStudentByEmail(String email)
	{
		Session session = sf.openSession();
		List<StudentBean> sb = session.createQuery("from StudentBean WHERE email = :email",StudentBean.class).setParameter("email", email).list();
		
		return !sb.isEmpty();
	}
	
	public StudentBean getStudentById(int id){
		Session session = sf.openSession();
		StudentBean student = session.get( StudentBean.class,id);
		return student;
	}
	
	public boolean updateStudent(StudentBean student)
	{
		Session session = sf.openSession();
		 try {
			 	
			 	tx = session.beginTransaction();
				session.update(student);
				tx.commit();
		        return true;
		    } catch (Exception e) {
		        if (tx != null) tx.rollback();
		        e.printStackTrace();
		    } finally {
		        session.close();
		    }
		    return false;
	}
	
	public boolean removeStudent(StudentBean studentBean)
	{
		Session session = sf.openSession();
		 try {
			 	
			 	tx = session.beginTransaction();
				session.delete(studentBean);
				tx.commit();
		        return true;
		    } catch (Exception e) {
		        if (tx != null) tx.rollback();
		        e.printStackTrace();
		    } finally {
		        session.close();
		    }
		    return false;
	}

}
