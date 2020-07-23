package com.sist.client;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class MovieManager {

	public static MovieVO[] movieListData() {
		MovieVO[] movies = new MovieVO[20];
		try {
			Document doc = Jsoup.connect("https://movie.daum.net/premovie/released").get(); 
			Elements title = doc.select(".name_movie");	
			Elements grade = doc.select(".num_grade");
			
			
			for(int i = 0; i < title.size(); i++) {
				movies[i] = new MovieVO();
				movies[i].setTitle(title.get(i).text());
				movies[i].setGrade(grade.get(i).text());
				System.out.println(movies[i].getTitle());
				System.out.println(movies[i].getGrade());
				System.out.println("================================");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return movies;
	}
	
	
	public static void main(String[] args) {
		
		movieListData();

	}

}
