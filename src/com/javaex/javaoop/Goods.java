package com.javaex.javaoop;

public class Goods {
	// 필드
	public String name;
	public int price;
	
	// 생성자
	// 초기화  or 초기값
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 메소드(getter/setter)
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// 출력
	public void showInfo() {
		System.out.print("상품 이름: ");
		System.out.println(name);
		System.out.print("상품 가격: ");
		System.out.println(price);
	}
	
}
