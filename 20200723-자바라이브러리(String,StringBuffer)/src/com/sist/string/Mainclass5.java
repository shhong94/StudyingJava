package com.sist.string;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Mainclass5 {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();	// 시작시간
		
//		StringBuffer data = new StringBuffer();
		StringBuilder data = new StringBuilder();	// StringBuilder가 더 빠름
		FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
		int i = 0;
		while((i = fr.read()) != -1) {
			data.append(String.valueOf((char)i));
		}
		fr.close();

		long end = System.currentTimeMillis();		// 끝나는시간
		
		System.out.println("수행시간 : " + (end - start));
	}

}
