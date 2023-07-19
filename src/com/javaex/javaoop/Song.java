package com.javaex.javaoop;

public class Song {
	
	public String title;
	public String artist;
	public String album;
	public String composer;
	public int year;
	public int track;
	

	// 생성
	public Song() {
		
	}
	
	// 초기화 or 초기값
	public Song(String title,String artist,String album,String composer,int year,int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
	}
	public Song(String title,String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	// 출력
	
	public void showinfo() {
		
		System.out.println(artist+", "+ title+ " ( "+ album+", "+year +", "+track +"번 track, "+composer+" 작곡 )" );
	}
	
}
