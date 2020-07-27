package com.sist.io;

/*
 * 	◆ 파일에 저장
 * 		1. 데이터를 ArrayList에 모아서 저장
 */

import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
//		FileOutputStream fos = null;
		FileWriter fos = null;
		
		try {
//			fos = new FileOutputStream("c:\\javaDev\\temp.txt", true);			// 뒤 매개변수는 append 여부
			fos = new FileWriter("c:\\\\javaDev\\\\temp.txt", true);
			String s = "asdaflsdknlksdng";
			
//			fos.write('L');
//			fos.write('M');
//			fos.write('C');
			fos.write(s + "\r\n");
			System.out.println("저장 완료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		

	}

}
