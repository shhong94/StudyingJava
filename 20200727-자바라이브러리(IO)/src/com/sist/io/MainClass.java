package com.sist.io;

/*
 * 	파일 읽기
 */

import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		FileReader fis = null;										// 반드시 초기값
		
		try {															// 파일 읽기
			fis = new FileReader("c:\\javaDev\\news1.txt");
			int i = 0;		// 한 글자씩 읽음(문자번호로 읽어오기 때문에 int로 잡음)
			while((i = fis.read()) != -1) {		// -1은 파일의 끝(EOF)
				System.out.print((char)i);
			}
		} catch (Exception e) {											// 에러 처리
			System.out.println(e.getStackTrace());
		}
		finally {														// 파일 닫기
			try {
				fis.close();
			}
			catch(Exception ex) {
				
			}
		}

	}

}
