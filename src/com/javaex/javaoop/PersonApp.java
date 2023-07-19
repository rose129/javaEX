package com.javaex.javaoop;

public class PersonApp {
	public static void main(String[] args) {
		Person p = new Person("정우성", 45);
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재", 45, "한국고등학교" );
		
		Person p2 = new Person("이정재", 45);
		p.showInfo();
		p2.showInfo();
		s1.showInfo();
		s2.showInfo();
	}
	
}
