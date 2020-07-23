package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;


/*
 * 	◆ 찾기 
 * 		1. 포함 contains		=======> LIKE '%데이터%'		}
 * 		2. 앞에서부터 startsWith	===> LIKE '데이터%'		}======> 리턴값 : 불린
 * 		3. 뒤에서부터 endsWith		===> LIKE '%데이터'		}
 * 
 * 	◆ 용도
 * 		contains 실제 찾기
 * 		
 */
public class MainClass2 {
	public void find(String ss) {
		try {
			for(int i = 1; i <= 3; i++) {		// 1페이지부터 3페이지까지 읽어오기
				Document doc = Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=" + i).get();
				Elements title = doc.select("a.name_movie");
				for(int j = 0; j < title.size(); j++) {
					if(title.get(j).text().endsWith(ss)) {
//					if(title.get(j).text().contains(ss)) {			// 포함되면 읽어오기
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
		System.out.print("영화제목 입력 : ");
		String ss = scan.next();
		m2.find(ss);

	}

}
