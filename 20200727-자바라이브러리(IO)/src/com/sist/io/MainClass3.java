package com.sist.io;

/*
 * 	ObjectStream
 * 
 * 
 */

import java.io.*;
import java.util.*;

class Movie implements Serializable {	// implements Serializable : 병렬로 저장되는 클래스 정보를 직렬화			
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
public class MainClass3 {

	public static void main(String[] args) {
		try {
			ArrayList<Movie> list = new ArrayList<Movie>();
			
			Movie m = new Movie();		// 인스턴스를 매번 새로 생성해야 함. (안그러면 전부 "이이이이" "이병박"이 됨)
			m.setMno(1);
			m.setTitle("전전전정");
			m.setActor("홍길동");
			list.add(m);
			
			m = new Movie();
			m.setMno(2);
			m.setTitle("공공공공");
			m.setActor("고길동");
			list.add(m);
			
			m = new Movie();
			m.setMno(3);
			m.setTitle("이이이이");
			m.setActor("이병박");
			list.add(m);
			
		// ArrayList 자체를 객체로 저장
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\movie_test.txt"));
			oos.writeObject(list);
			System.out.println("저장완료");
			
//			for(int i = 0; i < list.size(); i++) {
//				Movie mm = list.get(i);
//				System.out.println(mm.getTitle());
//			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		

	}

}
