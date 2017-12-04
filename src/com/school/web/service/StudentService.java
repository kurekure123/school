package com.school.web.service;

import com.school.web.bean.StudentBean;

public interface StudentService {
	public void addStudent(StudentBean student);
	public void addScore(StudentBean student);
	public StudentBean login(StudentBean student);
	public StudentBean find(String id);
	public void setCount(int count);
	public int getCount();
	public StudentBean[] list(/*파라 미터*/);
	public StudentBean findStudentById(String id);
	StudentBean[] findStudentByName(String name);
}
