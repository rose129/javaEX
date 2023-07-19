package com.javaex.javaoop;

public class Student extends Person{
	// 필드
	public String schoolName;
	
	// 생성자
	
	public Student(String schoolName) {
		// Person(); 부모족 디폴트 생성자 실행
		// super();
		this.schoolName = schoolName;
		
	}
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
	}
	
	// 메소드
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	// 출력
	public void showInfo() {
		System.out.println("이름: "+ getName() + " 나이: " + getAge() +" 학교: " + schoolName);
	}
//	@Override
//	public String toString() {
//		retern 
//		
//	}
}
