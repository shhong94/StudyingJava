/*
 * 1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트
 */
import java.io.*;
public class OldMovieManager {
	// 모든 클래스에서 공유할 경우 static 사용
	static MovieVO[] movies = new MovieVO[1938];
	
	// 프로그램 구동 시작하면 "자동으로" 파일을 읽어서 배열에 저장하기 위해 초기화 블록 사용
	static String data = "";
	static {
		try {
			// 파일을 읽을 땐 반드시 예외처리
			// try catch : 사용자가 직접 오류를 잡는다		throws exception : 오류를 시스템에게 짬때린다
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			while((i = fr.read()) != -1) {		// -1은 파일이 끝날 때까지 읽으라는 뜻(EOF(End of File))
				data += String.valueOf((char)i);				
			}
			fr.close();
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		System.out.println(data);
	}
}
