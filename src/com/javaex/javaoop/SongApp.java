package com.javaex.javaoop;

public class SongApp {
	public static void main(String[] args) {
		Song iu = new Song();
		
		iu.title = "좋은날";
		iu.artist = "아이유";
		iu.album = "Real";
		iu.composer = "이민수";
		iu.year = 2010;
		iu.track = 3;
		
		Song bigbang = new Song();
		
		bigbang.title = "거짓말";
		bigbang.artist = "BIGBANG";
		bigbang.album = "Always";
		bigbang.composer = "G-DRAGON";
		bigbang.year = 2007;
		bigbang.track = 2;
		
		Song busker = new Song();
		
		busker.title = "벚꽃엔딩";
		busker.artist = "버스커버스커";
		busker.album = "버스커버스커1집";
		busker.composer = "장범준";
		busker.year = 2012;
		busker.track = 4;
		
		Song newjeans = new Song();
		
		newjeans.title = "슈퍼샤이";
		newjeans.artist = "뉴진스";
		
		
		iu.showinfo();
		bigbang.showinfo();
		busker.showinfo();
		newjeans.showinfo();
	}
}
