package com.sist.cgv;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
	static MovieVO[] movies = new MovieVO[7];
	
	static {										// 프로그램 시작과 동시에 데이터를 불러오므로 static
		try {
			Document doc = Jsoup.connect("http://www.cgv.co.kr/movies/").get();		//	무비차트 페이지에서
			Elements link = doc.select(".box-contents a");							// 영화별 상세페이지 고르기
			
			int j = 0;		// 여러 a태그 중에서 필요한 태그는 짝수에 위치하기  때문에 변수 j 선언
			for(int i = 0; i < 7; i++) {
				movies[i] = new MovieVO();
//				System.out.println("http://www.cgv.co.kr" + link.get(j).attr("href"));	
				Document doc2 = Jsoup.connect("http://www.cgv.co.kr" + link.get(j).attr("href")).get();
				Element title = doc2.selectFirst(".title strong");
				Element poster = doc2.selectFirst(".thumb-image img");
				Element grade = doc2.selectFirst(".ico-grade");
				Element reserve = doc2.selectFirst(".percent span");
//				Elements dt = doc2.select(".spec dd");
//				for(int k = 0; k < dt.size(); k++) {
//					System.out.println("=====================================");
//					
//					System.out.println("=====================================");
//				}
				Element director = doc2.select(".spec dd").get(0);
//				System.out.println(director.text());
				movies[i].setDirector(director.text());
				
				Element actor = doc2.select(".spec dd").get(2);
//				System.out.println(actor.text());
				movies[i].setActor(actor.text());
					
				Element etc= doc2.select(".spec dd").get(4);
				Element regdate = doc2.select(".spec dd").get(5);
				String[] temp = etc.text().split(",");
				movies[i].setTime(temp[1].trim());
				movies[i].setFrom(temp[2].trim());
				
				if(i == 0) {
					Element genre = doc2.select(".spec dt").get(3);
//					System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1));
				}
				else {
					Element genre = doc2.select(".spec dt").get(2);
//					System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1));
				}
//				System.out.println(title.text());
				movies[i].setTitle(title.text());
//				System.out.println(poster.attr("src"));
				movies[i].setPoster(poster.attr("src"));
//				System.out.println(grade.text());
				movies[i].setGrade(grade.text());
//				System.out.println(reserve.text());
				movies[i].setReserve(reserve.text());
				movies[i].setMno(i+1);
				
				Element story = doc2.selectFirst(".sect-story-movie");
				movies[i].setStory(story.text());
				j = j+2;									
			}
		} catch (Exception e) {
			
		}
	}
	
//	public static void main(String[] args) {
//		MovieManager m = new MovieManager();
//		for(MovieVO vo : movies) {
//			System.out.println("===========================================================");
//			System.out.println("영화번호 : " + vo.getMno());
//			System.out.println("제목 : " + vo.getTitle());
//			System.out.println("감독 : " + vo.getDirector());
//			System.out.println("출연 : " + vo.getActor());
//			System.out.println("장르 : " + vo.getGenre());
//			System.out.println("등급 : " + vo.getGrade());
//			System.out.println("상영시간 : " + vo.getTime());
//			System.out.println("국가 : " + vo.getFrom());
//			System.out.println("상영일 : " + vo.getRegdate());
//			System.out.println("예매율 : " + vo.getReserve());
//			System.out.println("줄거리 : " + vo.getStory());
//		}
//	}
}
