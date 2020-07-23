package com.sist.string;

/*
 * 	StringBuffer 
 */
import java.io.*;

public class MainClass4 {

	public static void main(String[] args) {
		try {
			// 파일 읽기
			StringBuffer data = new StringBuffer();
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			while((i = fr.read()) != -1) {
				data.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(data.toString());
		} catch (Exception e) {
			
		}

	}

}
