package com.school.web.controller;


import javax.swing.JOptionPane;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;
import com.school.web.ui.MainPage;

public class StudentController {

	public static void main(String[] args){
	 	StudentService studentService = new StudentServiceImpl();
	 	/* String eCount = JOptionPane.showInputDialog(""); 
	 	 * 배열의 갯수를 만들기 위해서 필요했다.
	 	 * */
	 	String message = "";
	 	StudentBean student = null;
	 	StudentBean[] names = null;
	 	StudentBean temp = null;
	 	
	 	while(true) {
	 		
				switch(Integer.parseInt(JOptionPane.showInputDialog(
						"[Menu] 0. 종료, 1.학생부등록 , 2. 점수등록 \n" 
		 				+ "3. 총학생수 , 4. 학생이름 리스트, 5. 내 정보 보기 \n"
		 				+ " 6. 이름 검색, 7. 비번 변경, 8. 삭제, 9. 화면보기"))) {
				case 0 :
					JOptionPane.showMessageDialog(null, "시스템 종료");
					return;
				case 1 :
					message = "";
					student = new StudentBean();
					message = "";
					student.setId(JOptionPane.showInputDialog("ID 입력"));
					student.setPass(JOptionPane.showInputDialog("PW 입력"));
					student.setName(JOptionPane.showInputDialog("이름 입력"));
					studentService.addStudent(student);
					message = "등록완료";
					JOptionPane.showMessageDialog(null, message);
					
					
				case 2 :
				case 3 :
					message = "";
					int count1 = studentService.getCount();
					message = String.valueOf(studentService.getCount());
					JOptionPane.showMessageDialog(
							null, "총학생수는" + message);
					break;
				case 4 : 
					message = "";
					StudentBean[] students = studentService.list();
					for(int i = 0; i < studentService.getCount(); i++) {
						message += students[i].getName()+"\n";
					}
					JOptionPane.showMessageDialog(null, message);
					// length 는 마지막 값. 여기서는 students의 마지막 값이라는 뜻
					break;
				case 5 :
					message = "";
					temp = 
						studentService.findStudentById(
								JOptionPane.showInputDialog("ID 입력"));
					JOptionPane.showMessageDialog(null, temp.getName());
					message = temp.getName();
					JOptionPane.showMessageDialog(null, message);
					break;
				case 6 :
					message = "";
					names = 
							studentService.findStudentByName(
									JOptionPane.showInputDialog("검색 이름 입력"));
					if(names == null) {
						message = ("검색하려는 이름이 존재하지 않습니다.");
					}else {
						for(int i = 0; i < names.length; i++) {
							message += names[i].toString()+"\n";
						}
					}
					JOptionPane.showMessageDialog(null, message);
					break;
					
				case 7 :
					message = "";
					student = new StudentBean();
					/* 위에 것은 initializing 이 아니라 리모델링개념, 초기화는 String 이나 int 등 정의를 해줘야함.
					 * */
					student.setId(
							JOptionPane.showInputDialog("수정하려는 비번의 ID"));
					student.setPass(
							JOptionPane.showInputDialog("수정할 비번"));
					studentService.updatePassword(student);
					message = "수정완료";
					JOptionPane.showMessageDialog(null, message);
					/* StudentBean resStudent = studentService.findStudentById(student.getId());
					System.out.println(resStudent.toString()); 
					 사용자에게 보여주기 편하게 하려면 사용... 복잡... */
					break;
				case 8 :
					studentService.deliteId(
							JOptionPane.showInputDialog("삭제하려는 ID 입력"));
					break;
				case 9 :
					MainPage mp = new MainPage();
				
					break;
					
				}  // 바꾸기 전이랑 바뀐 비번이 보여지게
	 	}
	}	
}
