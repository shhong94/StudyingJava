/*
 * 1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트
 */
import java.io.*;
import java.util.Scanner;
public class MovieManager {
	// 모든 클래스에서 공유할 경우 static 사용
	static MovieVO[] movies = new MovieVO[1938];	// movies[]는 아직 초기화가 되지 않음. 각 인덱스가 null일 뿐임
	
	// 프로그램 구동 시작하면 "자동으로" 파일을 읽어서 배열에 저장하기 위해 초기화 블록 사용
	static {
		try {
			StringBuffer data = new StringBuffer();
			// 파일을 읽을 땐 반드시 예외처리
			// try catch : 사용자가 직접 오류를 잡는다		throws exception : 오류를 시스템에게 짬때린다
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			while((i = fr.read()) != -1) {		// -1은 파일이 끝날 때까지 읽으라는 뜻(EOF(End of File))
				data.append(String.valueOf((char)i));				
			}
			fr.close();
			
			String[] movieData = data.toString().split("\n"); 
			int k = 0;
			for(String s : movieData) {
				String[] ss = s.split("\\|"); 	// "|" 앞에 역슬래시 두개를 붙여야 함("|"가 정규식이기 때문)
				movies[k] = new MovieVO();		// movies[]를 초기화
				movies[k].mno = Integer.parseInt(ss[0]);	// ss[]의 1,2,3,4...는 정수가 아니라 문자열임. 따라서 parseInt 사용해야 함.
				movies[k].title = ss[1];
				movies[k].genre = ss[2];
				movies[k].poster = ss[3];
				movies[k].actor = ss[4];
				movies[k].regdate = ss[5];
				movies[k].grade = ss[6];
				movies[k].director = ss[7];
				k++;
			}
		}catch(Exception ex) {}
	}
	
	// 페이지 나누기
	static MovieVO[] movieListData(int page) {
		MovieVO[] m = new MovieVO[10];		// 크기가 10인 배열 m 초기화
		int i = 0;				// 10개씩 나눠주는 변수(0 ~ 9, 10 ~ 19.....)
		int j = 0;				// for 반복횟수
		int rowSize = 10;		// 각 페이지당 몇개를 출력할지
		int pagecnt = (page * rowSize) - rowSize;		// 페이지당 처음 시작하는 영화 번호 (ex 1페이지면 영화번호 0부터 시작, 2페이지면 10부터 시작)
		for(MovieVO vo : movies) {
			if(i > 10) {
				break;
			}
			if(i < 10 && j >= pagecnt) {	// 입력받은 page에 따라 pagecnt가 설정 됨. 
				m[i] = vo;					// j가 pagecnt보다 커질 때까지 for문을 넘기고
				i++;						// j가 pagecnt보다 크고 && i가 10 미만일 때 비로소 movies[]배열의 내용을 출력.
			}
			j++;
		}
		return m;
	}
	
	// 페이지 나누기(MovieFindData)
	static MovieVO[] movieFindData(int page) {
		MovieVO[] m = new MovieVO[50];		// 크기가 10인 배열 m 초기화
		int i = 0;				// 10개씩 나눠주는 변수(0 ~ 9, 10 ~ 19.....)
		int j = 0;				// for 반복횟수
		int rowSize = 50;		// 각 페이지당 몇개를 출력할지
		int pagecnt = (page * rowSize) - rowSize;		// 페이지당 처음 시작하는 영화 번호 (ex 1페이지면 영화번호 0부터 시작, 2페이지면 10부터 시작)
		for(MovieVO vo : movies) {
			if(i > 50) {
				break;
			}
			if(i < 50 && j >= pagecnt) {	// 입력받은 page에 따라 pagecnt가 설정 됨. 
				m[i] = vo;					// j가 pagecnt보다 커질 때까지 for문을 넘기고
				i++;						// j가 pagecnt보다 크고 && i가 10 미만일 때 비로소 movies[]배열의 내용을 출력.
			}
			j++;
		}
		return m;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 입력 : ");
		int page = scan.nextInt();
		MovieVO[] movie = movieListData(page);
		for(MovieVO vo : movie) {
			System.out.println("영화 번호 : " + vo.mno);
			System.out.println("영화명 : " + vo.title);
			System.out.println("==================================================");
		}
		
	}
	
	
//	public static void main(String[] args) {
////		System.out.println(data.toString());
//		for(MovieVO vo : movies) {
//			System.out.println("영화번호 : " + vo.mno);
//			System.out.println("영화명 : " + vo.title);
//			System.out.println("장르 : " + vo.genre);
//			System.out.println("출연 : " + vo.actor);
//			System.out.println("감독 : " + vo.director);
//			System.out.println("등급 : " + vo.grade);
//			System.out.println("개봉일 : " + vo.regdate);
//			System.out.println("===========================================");
//		}
//	}
}
