package com.school.web.bean;

public class StudentBean {
	private String id, pass, name;
	private int kor, eng, math ;
	// 멤버 변수
	
	public void setId(String Id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return this.id;
	}
	public void setName(String Name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	public String toString() {
		return String.format("[이름] %s [ID] %s [비번] %s", name, id, pass);
	}
	
}
