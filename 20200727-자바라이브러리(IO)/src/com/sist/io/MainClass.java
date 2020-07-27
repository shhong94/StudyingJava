package com.sist.io;

/*
 * 	���� �б�
 */

import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		FileReader fis = null;										// �ݵ�� �ʱⰪ
		
		try {															// ���� �б�
			fis = new FileReader("c:\\javaDev\\news1.txt");
			int i = 0;		// �� ���ھ� ����(���ڹ�ȣ�� �о���� ������ int�� ����)
			while((i = fis.read()) != -1) {		// -1�� ������ ��(EOF)
				System.out.print((char)i);
			}
		} catch (Exception e) {											// ���� ó��
			System.out.println(e.getStackTrace());
		}
		finally {														// ���� �ݱ�
			try {
				fis.close();
			}
			catch(Exception ex) {
				
			}
		}

	}

}
