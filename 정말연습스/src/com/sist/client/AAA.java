package com.sist.client;

import java.util.*;
import java.io.*;

class Movie{
	private int mno;
	private String title;
	private String actor;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
}

public class AAA {

	public static void main(String[] args) {
		try {
			ArrayList<Movie> list = new ArrayList<Movie>();
			
			Movie m = new Movie();
			m.setMno(0);
			m.setTitle("¾Æ¾Æ¾Æ¾Æ");
			m.setActor("È«È«È«");
			
			m = new Movie();
			m.setMno(1);
			m.setTitle("¶ó¶ó¶ó¶ó");
			m.setActor("±è±è±è");
			
			for(int i = 0; i < list.size(); i++) {
				Movie mm = list.get(i);
				System.out.println(mm.getTitle());
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
		
		
	}

}
