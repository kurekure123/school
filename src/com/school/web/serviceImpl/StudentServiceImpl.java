package com.school.web.serviceImpl;

import com.school.web.bean.StudentBean;
import com.school.web.controller.StudentController;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentBean[] students; 
	private int count;
	
	
	public StudentServiceImpl(int count) {
		this.count = 0;
		students = new StudentBean[count];
		// TODO Auto-generated constructor stub
		}
	@Override
	public void addStudent(StudentBean student) {
		students[count] = student;
		count++;
	}
	
	// 학생 수가 불가능. 
	@Override
	public void addScore(StudentBean score) {
		
	}
	@Override
	public StudentBean login(StudentBean student) {
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public StudentBean find(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StudentBean[] list(/*파라 미터*/) {
		return students;
 	}
	@Override
	public void setCount(int count) {
		this.count = count;
		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
	@Override
	public StudentBean findStudentById(String id) {
		StudentBean student = new StudentBean();
		for(int i = 0; i < count; i++) {
			if(id.equals(students[i].getId())) {
				/* 상수 값 i (외부 정보)  로 변수 값을 비교한다
				 * equals 대시 == (premitive) 로 비교하면 주소값을 비교함.
				 * */
				student = students[i];
				break;
			}
		}
		return student;
	}
	@Override
	public StudentBean[] findStudentByName(String name) {
		StudentBean[] students = null;
		int matchCount = 0;
		for(int i = 1; i < count; i ++) {
			if(name.equals(this.students[i].getName())) {
				matchCount++;
			}
		}
		if(matchCount != 0 ) {
			students = new StudentBean[matchCount];
			for(int i = 0, j = 0; i < count; i++) {
				if(name.equals(this.students[i].getName())) {
					students[j] = this.students[i];
					j++;
					// 맞으면 j는 일시 증가해서 for loop를 벗어남
					if(j == matchCount){
						break;
					}
				}
			
		}
		}
		
		
		return students;
	}

}

