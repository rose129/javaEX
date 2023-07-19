package com.javaex.javaoop;

public class Circle extends Shape {
	// 필드
	private int radius;

	// 생성자
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
		
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	// 메소드 일반
	public void draw() {
		System.out.println("원  - 면색: " + fillColor + " 반지름: " + radius);
		
	}
	public double area() {
		return radius*radius*3.14;
	}
	
	// test
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
}
