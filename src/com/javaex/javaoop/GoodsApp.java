package com.javaex.javaoop;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
//		System.out.println(camera.name);
//		System.out.println(camera.price);
		camera.name = "nikon";
		camera.price = 400000;
//		System.out.println(camera.name);
//		System.out.println(camera.price);
		
		Goods laptop = new Goods();
		
		laptop.name = "LG그램";
		laptop.price = 900000;
		
		Goods mugcup = new Goods();
		
		mugcup.name = "머그컵";
		mugcup.price = 2000;
		
		camera.showInfo();
		laptop.showInfo();
		mugcup.showInfo();
	}
}
