package com.sist.io;

/*
 * 	�� ���Ͽ� ����
 * 		1. �����͸� ArrayList�� ��Ƽ� ����
 */

import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
//		FileOutputStream fos = null;
		FileWriter fos = null;
		
		try {
//			fos = new FileOutputStream("c:\\javaDev\\temp.txt", true);			// �� �Ű������� append ����
			fos = new FileWriter("c:\\\\javaDev\\\\temp.txt", true);
			String s = "asdaflsdknlksdng";
			
//			fos.write('L');
//			fos.write('M');
//			fos.write('C');
			fos.write(s + "\r\n");
			System.out.println("���� �Ϸ�");
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
