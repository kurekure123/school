package com.school.web.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainPage extends JFrame{
	JButton btn1, btn2, btn3, btn4;
	
	public MainPage() {
		super("학생관리 시스템");
		this.setLayout(new FlowLayout());
		btn1  = new JButton("학생수");
		btn2  = new JButton("학생등록");
		btn3  = new JButton("학생 검색");
		btn4  = new JButton("학생 목록");
		// Container container=this.getContentPane();
		//container.add("North", bt1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		// this.add(btn2);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
