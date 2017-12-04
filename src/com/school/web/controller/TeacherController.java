package com.school.web.controller;

import java.util.Scanner;

import com.school.web.serviceImpl.TeacherServiceImpl;

public class TeacherController {
	public static void main(String[] args){
	 	Scanner s = new Scanner(System.in);
	 	while(true) {
	 		System.out.println("[Menu] 0. 종료, 1. 회원가입, 2. 교과목 조회");
			int button = s.nextInt();
				switch(button) {
				case 0 :
					System.out.println("종료");
					return;
				case 1 :
					TeacherServiceImpl theacherservice = new TeacherServiceImpl();
					System.out.println(""+
							"Id"+
							"password"+
							"name"
							);
					
				case 2 :
					System.out.println();
				}
	 	}
	}	
}
