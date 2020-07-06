/*
 * 	◆ 예외처리
 * 		1. 에러발생시 직접 처리 (try ~catch)
 * 		2. 에러발생시 회피 (시스템에 맡김. throws)
 * 
 * 
 * <td class="info">
 * <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('90443299','1');return false;">
 * How You Like That</a>
 */


import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import com.sun.xml.internal.txw2.Document;
public class 자바메소드2 {
	
	static String[] genieMusicData() throws Exception {
		String[] data = new String[50];
		org.jsoup.nodes.Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("td.info a.title");
		for(int i = 0; i < 50; i++) {
			data[i] = title.get(i).text();
		}
		return data;
	}	
	
	static String[] genieMusicFind(String ss) throws Exception {
		
		String[] data = genieMusicData();
		int k = 0;
		for(String title : data) {
			if(title.contains(ss)) {
				k++;
			}
		}
		
		String[] find = new String[k];
		
		for(String title : data) {
			if(title.contains(ss)) {
				find[k] = title;
				k++;
			}
		}
		return find;
		
	}
	
	
	
// =========================================================================================== 메인	
	public static void main(String[] args) throws Exception {
		String[] data = genieMusicData();
		for(String title : data) {
			System.out.println(title);
		}
		System.out.println("==================================================");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("곡명을 입력 : ");
		String ss = scan.nextLine();
		String[] fd = genieMusicFind(ss);
		for(String title : fd) {
			System.out.println(title);
		}

	}

}
