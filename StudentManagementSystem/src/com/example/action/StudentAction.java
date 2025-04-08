package com.example.action;

import java.util.List;

import com.example.model.StudentBean;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction implements ModelDriven<StudentBean>{
	
	
	
	private StudentBean studentBean = new StudentBean();
	private StudentService studentService = new StudentServiceImpl();
	private List<StudentBean> studentList;
	private boolean update;
	private int id;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isUpdate() {
	    return update;
	}

	public void setUpdate(boolean update) {
	    this.update = update;
	}


	public String saveStudentDetails()
	{
//		System.out.println("inside action saveStudentDetails()");
//		System.out.println(studentBean.getName());
//		System.out.println(studentService.getStudentByEmail(studentBean.getEmail()));
		
		
		if(studentService.getStudentByEmail(studentBean.getEmail())) {
			return "duplicate";
		}
		
		boolean save = studentService.saveUser(studentBean);
		if(save) {
			System.out.println("student details saved successfully");
			System.out.println(studentBean.getName());
			return "success";
		}
			
		
		return "error";
	}
	
	
	
	
    public String fetchAllStudent() {
        studentList = studentService.getAllStudent();
        
        for (StudentBean studentBean : studentList) {
			System.out.println(studentBean.getId());
		}
        if (studentList != null && !studentList.isEmpty())
            return "listPage";
        
        return "error";
    }

    // Getter for JSP
    public List<StudentBean> getStudentList() {
        return studentList;
    }

    
    
    
    public String editStudent()
    {
    	int actualId = studentBean.getId();
        System.out.println("Inside edit() : isUpdate = " + isUpdate() + ", id = " + actualId);
    	if(isUpdate() && actualId > 0)
    		
    		return "success";
    	
    	return "error";
    }
    
    public String updateStudent()
    {
    	  System.out.println("inside update()");
    	  StudentBean existingStudent = studentService.getStudentById(studentBean.getId());
    	  
    	  if (existingStudent == null) {
    	        return "error"; // No record found to update
    	    }
    	  
    	  if (studentBean.getName() != null && !studentBean.getName().trim().isEmpty()) {
    	        existingStudent.setName(studentBean.getName());
    	    }
    	  
    	  if (studentBean.getEmail() != null && !studentBean.getEmail().trim().isEmpty()) {
    	        existingStudent.setEmail(studentBean.getEmail());
    	    }

    	    if (studentBean.getBranch() != null && !studentBean.getBranch().trim().isEmpty()) {
    	        existingStudent.setBranch(studentBean.getBranch());
    	    }
    	    
    	    boolean updated = studentService.updateStudent(existingStudent);
    	    
    	    if (updated) {
    	        System.out.println("Student updated: " + existingStudent.getId());
    	        return "success";
    	    }

    	    return "error";
    }
    
    public String deleteStudent()
    {
    	 StudentBean existingStudent = studentService.getStudentById(studentBean.getId());
    	  
	   	  if (existingStudent == null) {
	   	        return "error"; // No record found to update
	   	  }
	   	  boolean isDelete = studentService.removeStudent(existingStudent);
	   	  if(isDelete)
	   		  return "success";
	   	 return "error";
    }

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public StudentBean getModel() {
		// TODO Auto-generated method stub
		return studentBean;
	}
}
