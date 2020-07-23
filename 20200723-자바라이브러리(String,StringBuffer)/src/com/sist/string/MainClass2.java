package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;


/*
 * 	�� ã�� 
 * 		1. ���� contains		=======> LIKE '%������%'		}
 * 		2. �տ������� startsWith	===> LIKE '������%'		}======> ���ϰ� : �Ҹ�
 * 		3. �ڿ������� endsWith		===> LIKE '%������'		}
 * 
 * 	�� �뵵
 * 		contains ���� ã��
 * 		
 */
public class MainClass2 {
	public void find(String ss) {
		try {
			for(int i = 1; i <= 3; i++) {		// 1���������� 3���������� �о����
				Document doc = Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=" + i).get();
				Elements title = doc.select("a.name_movie");
				for(int j = 0; j < title.size(); j++) {
					if(title.get(j).text().endsWith(ss)) {
//					if(title.get(j).text().contains(ss)) {			// ���ԵǸ� �о����
						System.out.println(title.get(j).text());
					}
				}
				
			}
		} catch (Exception ex) {
			
		}
	}
	
	public static void main(String[] args) {
		MainClass2 m2 = new MainClass2();
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȭ���� �Է� : ");
		String ss = scan.next();
		m2.find(ss);

	}

}
