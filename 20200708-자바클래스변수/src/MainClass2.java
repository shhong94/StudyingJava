/*
 *  
 */
class MovieInfo {
	// 인스턴스 변수
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String siteName;
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		MovieInfo m1 = new MovieInfo();
		m1.title = "#살아있다";
		m1.director = "조일형";
		m1.actor = "유아인";
		m1.reserve = 17.3;
		m1.rank = 2;
		m1.siteName = "CGV";
		
		MovieInfo m2 = new MovieInfo();
		m2.title = "다크 나이트 라이즈";
		m2.director = "크리스토퍼 놀란";
		m2.actor = "크리스찬 베일";
		m2.reserve = 7.8;
		m2.rank = 4;
		m1.siteName = "롯데시네마";
		
		MovieInfo m3 = new MovieInfo();
		m3.title = "원 데이";
		m3.director = "론 쉐르픽";
		m3.actor = "앤 해서웨이";
		m3.reserve = 1.3;
		m3.rank = 6;
		m3.siteName = "메가박스";

		MovieInfo.siteName = "서울극장";
		
		MovieInfo[] info = new MovieInfo[3];
		
	}

}
