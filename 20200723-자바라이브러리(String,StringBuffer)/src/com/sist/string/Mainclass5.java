package com.sist.string;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Mainclass5 {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();	// ���۽ð�
		
//		StringBuffer data = new StringBuffer();
		StringBuilder data = new StringBuilder();	// StringBuilder�� �� ����
		FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
		int i = 0;
		while((i = fr.read()) != -1) {
			data.append(String.valueOf((char)i));
		}
		fr.close();

		long end = System.currentTimeMillis();		// �����½ð�
		
		System.out.println("����ð� : " + (end - start));
	}

}
