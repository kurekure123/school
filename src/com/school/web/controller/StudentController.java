package com.school.web.controller;

import java.util.Scanner;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;

public class StudentController {

	public static void main(String[] args){
	 	Scanner s = new Scanner(System.in);
	 	System.out.println("반 정원 입력");
	 	StudentService studentService = new StudentServiceImpl(s.nextInt());
	 	StudentBean student = null;
	 	while(true) {
	 		System.out.println("[Menu] 0. 종료, 1.학생부등록 , 2. 점수등록" 
	 				+ "3. 총학생수 , 4. 학생이름 리스트, 5. 내 정보 보기, 6. 이름 검색"
	 				+ "");
				switch(s.nextInt()) {
				case 0 :
					System.out.println("종료");
					return;
				case 1 :
					student = new StudentBean();
					System.out.println("ID 입력");
					student.setId(s.next());
					System.out.println("PW 입력");
					student.setPass(s.next());
					System.out.println("이름 입력");
					student.setName(s.next());
					studentService.addStudent(student);
					
				case 2 :
					System.out.println();
				case 3 :
					int count1 = studentService.getCount();
					System.out.println("총 학생수는 " 
					+ studentService.getCount());
					break;
				case 4 : 
					StudentBean[] students = studentService.list();
					for(int i = 0; i < students.length; i++) {
						System.out.println(students[i].getName());
					}
					// length 는 마지막 값. 여기서는 students의 마지막 값이라는 뜻
					break;
				case 5 :
					String id = s.next();
					StudentBean temp = studentService.findStudentById(id);
					System.out.println(temp.getName());
					break;
				case 6 :
					System.out.println("검색 이름 입력");
					StudentBean[] names = studentService.findStudentByName(s.next());
					if(names == null) {
						System.out.println("검색하려는 이름이 존재하지 않습니다.");
					}else {
						for(int i = 0; i < names.length; i++) {
							System.out.println(names[i].toString());
						}
						break;
						
					}
				}
	 	}
	}	
}
