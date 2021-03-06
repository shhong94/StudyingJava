package com.sist.client;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class SteamManager {
	
	
	
	// 제조사별 차종 테이블
	public void SteamDataTable() {
		ArrayList<SteamVO> list2 = new ArrayList<SteamVO>();
		
		int cno = 1;
		for(int i = 0; i < 45; i++) {
			try {
				Document doc = Jsoup.connect("https://store.steampowered.com/search/?filter=popularnew&sort_by=Released_DESC&os=win").get();
					
//				Element photo = doc.select("#search_resultsRows img").get(i);		// 사진
//				System.out.println(photo.attr("src"));
				Element title = doc.select("span.title").get(i);	// 제목
				System.out.println(title.text());
				Element price = doc.select("div.col.search_price.responsive_secondrow").get(i);			// 가격
				System.out.println(price.text());
				Element date = doc.select("div.col.search_released.responsive_secondrow").get(i);			// 발매일
				System.out.println(date.text());
				System.out.println("=====================================================================");
				
				
//				String data = cno + "|" + photo.attr("src") + "|" +
//								title.text() +"|"+
//								price.text() +"|"+
//								date.text() + "\r\n";
//				FileWriter fw = new FileWriter("c:\\javaDev\\Steam.txt", true);
//				fw.write(data);
//				fw.close();
				
								
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		}
	}
	
	
	
	public void SteamDataDetail() {
		ArrayList<SteamVO> list2 = new ArrayList<SteamVO>();
		
		int cno = 2;
		//https://store.steampowered.com/search/?sort_by=Released_DESC&os=win
			try {
				Document doc = Jsoup.connect("https://store.steampowered.com/search/?sort_by=Reviews_DESC&filter=topsellers").get();
				Elements link = doc.select("#search_resultsRows a");
				
			
				for(int i = 1; i <= 45; i++) {
					String url = link.get(i).attr("href");
					Document doc2 = Jsoup.connect(url).get();
//					System.out.println(doc2);
					
//					Element photo = doc2.select(".block .game_background_glow .game_header_image_full img").get(i);		// 사진
//					System.out.println(photo.attr("src"));
//					Elements title = doc2.select(".apphub_AppName");	// 제목
//					System.out.println(title.text());
	//				Element date = doc.select("div.col.search_released.responsive_secondrow").get(i);			// 발매일
	//				System.out.println(date.text());
					Elements description = doc2.select(".game_description_snippet");					// 게임설명
					System.out.println(description.text());
					Elements review = doc2.select(".user_reviews .game_review_summary");				// 평가
					System.out.println(review.text());
					Element company = doc2.select(".glance_ctn_responsive_left .dev_row").get(0);		// 개발사
					System.out.println(company.text());
					Elements spec = doc2.select(".game_area_sys_req_rightCol");							// 요구사양
					System.out.println(spec.text());
					
					System.out.println("=====================================================================");
	//				
	//				
	//				String data = cno + "|" + photo.attr("src") + "|" +
	//								title.text() +"|"+
	//								price.text() +"|"+
	//								date.text() + "\r\n";
	//				FileWriter fw = new FileWriter("c:\\javaDev\\Steam.txt", true);
	//				fw.write(data);
	//				fw.close();
					}
			}
			catch(Exception e) {
				
			}
				
								
			
		
		
	}
	
	
	

	public static void main(String[] args) {
		SteamManager a = new SteamManager();

//		a.SteamDataTable();
		a.SteamDataDetail();

	}

}
