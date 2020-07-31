package com.sist.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 	�� ���α׷� �ۼ�
 * 		1. ����
 * 			�� ��ü ���� �о �и� �� �޸𸮿� ����	
 * 				FileReader  StringTokenizer	 split  ArrayList
 * 			�� �޸𸮿��� ����
 * 		2. ����Ŭ
 * 			�ʿ�ø��� ����Ŭ�� ���� => �޼ҵ� �ȿ��� ó��
 * 
 * 	�� ���� �б�
 * 		1. �� ���ھ� �д� �� read()
 * 				FileInputStream
 * 				FileReader
 * 		2. �� �پ� �д� �� readline()
 * 				�ӽð����� ���� �� �о����
 * 				BufferedReader
 */

public class MovieManager {
	// ������ ����
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	
	// ���α׷� �������ڸ��� ������ ���� �� ArrayList�� ���� (��� �ڹ����Ͽ��� ����ϹǷ� �ݵ�� static)
	static {
		try {
			FileInputStream fr = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// �޸𸮿� ��ü ������ ������
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));
			while(true){
				String movie = in.readLine();		// readLine()�� "\n"
				if(movie == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(movie, "|");
				while(st.hasMoreTokens()) {
					MovieVO vo = new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:" + st.nextToken()); 		// poster�� "https:" ���̱�
					String score = st.nextToken();
					score = score.substring(score.indexOf("��")+1);	//=======================================================
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate = st.nextToken();
					regdate.substring(0, regdate.lastIndexOf("��"));
					vo.setRegdate(regdate);
					String grade = st.nextToken();
					grade = grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));	//	�������� ������ ���ֱ�
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
	// ������ ������
		int i = 0;	// 10���� �����ִ� ����
		int j = 0;	// �ݺ��� ���ư��� ����
		int pagecnt = (page*10) - 10;	// ���� ��ġ
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
	
	// �󼼺���
	public MovieVO movieDetailData(int mno) {
		return list.get(mno-1);		// ArrayList�� �ε����� 0������ �����ϰ� �������� ��ȣ�� 1������ ���۵��� ������ 1�� ����� ��.
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
	
	// �˻�
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
//		System.out.print("������ : ");
//		int page = scan.nextInt();
//		
//		MovieManager m = new MovieManager();
//		System.out.println(page + " page / " + m.movieTatalPage() + " pages");
//		
//		// ������ �б�
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
