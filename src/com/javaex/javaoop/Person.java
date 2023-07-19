package com.javaex.javaoop;

public class Person {
	// 필드
	public String name;
	public int age;
	
	// 생성자
	public Person() {};
	
	public Person(String name,int age) {
		 this.name = name;
		 this.age = age;
		 
	}
	
     // 메소드
     
     public String getName() {
 		return name;
 	}
 	 public void setName(String name) {
 		this.name = name;
 	}
 	 public int getAge() {
 		return age;
 	}
 	 public void setAge(int age) {
 		this.age = age;
 	}
     
     //출력
 	public void showInfo() {
		System.out.println("name: "+ name + " age: "+ age);
	}
     
     
}
