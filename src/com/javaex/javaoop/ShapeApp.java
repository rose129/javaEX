package com.javaex.javaoop;

public class ShapeApp {
	public static void main(String[] args) {
		// 메인
		// 배열로 관리
		// Shape 배열 마들기
		Shape[] sArray = new Shape[2];
		
		// 사각형 만들기
		// 안됨
		Rectangle r = new Rectangle("검정", "하양", 11, 8);
//		Shape r01 = new Rectangle("검정", "하양", 11, 8);		
		
		// 원 만들기
		Circle c = new Circle("분홍", "노랑", 20);
//		Shape c01 = new Circle("분홍", "노랑", 20);
		
		// 배열에 주소를 넣기
		sArray[0] = r;
		sArray[1] = c;
//		System.out.println(sArray.length);
		
		for (int i=0; i<sArray.length; i++) {
//			System.out.println("i" + i);
			sArray[i].draw();		
//			System.out.println(sArray[0].toString());
			}
		for (int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
       //테스트
//       Shape s = new Shape("빨강", "빨강");
//       System.out.println(s.toString());
//
//       Ractangle r = new Ractangle("검정", "하양", 11, 8);
//       System.out.println(r.toString());
//      
//       Circle c = new Circle("분홍", "노랑", 20);
//       System.out.println(c.toString());
	     
				
	}
}
