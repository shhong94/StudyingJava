package com.sist.io;

import java.io.*;
import java.util.*;

public class MainClass4 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
				
		try {
			ois = new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			ArrayList<Movie> list = (ArrayList<Movie>)ois.readObject();		// readObject() 리턴값이 Object이기 때문에 형변환 필요
			
			for(Movie m : list) {
				System.out.println(m.getMno() + " " + m.getTitle() + " " + m.getActor());
			}
		
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
