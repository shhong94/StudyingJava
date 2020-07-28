package com.sist.client;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;

public class ElectionManager {
	ArrayList<ElectionVO> list = new ArrayList<ElectionVO>();


	
	public void electionData() {
		int mno = 1;
		for(int i = 1; i <= 3; i++) {
			try {
			
				Document doc = Jsoup.connect("https://entertain.naver.com/movie#date=2020-07-28&page=" + i).get();
				Elements poster = doc.select(".thumb_area img");
				Elements title = doc.select(".tit_area a");
				Elements press = doc.select("span.press");
				
				for(int j = 0; j < poster.size(); j++) {
					System.out.println(mno);
					System.out.println(poster.get(j).attr("src"));
					System.out.println(title.get(j).text());
					System.out.println(press.get(j).text());
					System.out.println("====================================================");
					
					String msg = mno + "|" + poster.attr("src") + "|" + title.text()
					+ "|" + press.text() + "\r\n";
					
//					FileWriter fw = new FileWriter("c:\\javaDev\\NewsEntertain.txt", true);
//					fw.write(msg);
//					fw.close();
					
					mno++;
				}
		
					
			} 
			catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
			
		} 
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ElectionManager e = new ElectionManager();
		e.electionData();

	}

}
