package com.javaex.javaoop;

public class PointApp {
	
	public static void main(String[] args) {
		Point one = new Point();
		
		one.x = 5;
		one.y = 5;
		
		Point two = new Point();
		
		two.x = 10;
		two.y = 23;
		
		one.draw();
		two.draw();
		one.erase();
		two.erase();
		
	}
			
}
