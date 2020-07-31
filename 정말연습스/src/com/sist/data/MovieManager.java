package com.sist.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 	◆ 프로그램 작성
 * 		1. 파일
 * 			① 전체 파일 읽어서 분리 후 메모리에 저장	
 * 				FileReader  StringTokenizer	 split  ArrayList
 * 			② 메모리에서 제어
 * 		2. 오라클
 * 			필요시마다 오라클에 연결 => 메소드 안에서 처리
 * 
 * 	◆ 파일 읽기
 * 		1. 한 글자씩 읽는 법 read()
 * 				FileInputStream
 * 				FileReader
 * 		2. 한 줄씩 읽는 법 readline()
 * 				임시공간에 저장 후 읽어오기
 * 				BufferedReader
 */

public class MovieManager {
	// 데이터 저장
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	
	// 프로그램 시작하자마자 데이터 수집 후 ArrayList에 저장 (모든 자바파일에서 사용하므로 반드시 static)
	static {
		try {
			FileInputStream fr = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 메모리에 전체 데이터 모으기
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));
			while(true){
				String movie = in.readLine();		// readLine()은 "\n"
				if(movie == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(movie, "|");
				while(st.hasMoreTokens()) {
					MovieVO vo = new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:" + st.nextToken()); 		// poster는 "https:" 붙이기
					String score = st.nextToken();
					score = score.substring(score.indexOf("점")+1);	//=======================================================
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate = st.nextToken();
					regdate.substring(0, regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					String grade = st.nextToken();
					grade = grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));	//	관객수의 반점을 없애기
					vo.setStory(st.nextToken());
					list.add(vo);
					
					
				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> movies = new ArrayList<MovieVO>();
	// 페이지 나누기
		int i = 0;	// 10개씩 나눠주는 변수
		int j = 0;	// 반복문 돌아가는 변수
		int pagecnt = (page*10) - 10;	// 저장 위치
		for(MovieVO vo : list) {
			if(i < 10 && j >= pagecnt) {
				movies.add(vo);
				i++;
			}
			j++;
		}
		
		
		return movies;
	}
	
	public int movieTatalPage() {	
		return (int)(Math.ceil(list.size() / 10.0));
	}
	
	// 상세보기
	public MovieVO movieDetailData(int mno) {
		return list.get(mno-1);		// ArrayList의 인덱스는 0번부터 시작하고 포스터의 번호는 1번부터 시작도기 때문에 1을 빼줘야 함.
	}
	
	
	public ArrayList<MovieVO> movieAllData(int cno){
		ArrayList<MovieVO> movies = new ArrayList<MovieVO>();
		for(MovieVO vo : list) {
			if(vo.getCno() == cno) {
				movies.add(vo);
			}
		}
		return movies;
	}
	
	// 검색
//	public ArrayList<MovieVO> movieFindData(String ss){
//		ArrayList<MovieVO> movies = new ArrayList<MovieVO>();
//		for(MovieVO vo : list) {
//			if(vo.getTitle()).contains(ss){
//				movies.add(0);
//			}
//		}
//	}
	
	
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("페이지 : ");
//		int page = scan.nextInt();
//		
//		MovieManager m = new MovieManager();
//		System.out.println(page + " page / " + m.movieTatalPage() + " pages");
//		
//		// 데이터 읽기
//		ArrayList<MovieVO> list = m.movieListData(page);
//		
//		for(MovieVO vo : list) {
//			System.out.println(vo.getTitle().contains(ss));
//		}
		
//		for(MovieVO vo : list) {
//			if(vo.getTitle().contains(ss)) {
//				System.out.println(vo.getTitle());
//			}
////		}
//	}
//	
}
