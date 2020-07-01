/*
 * 	◆ 영화 정보를 저장하는 변수
 * 
 * 위대한 쇼맨(2017)상영중
The Greatest Showman 평점 09 . 9
뮤지컬/드라마
미국
2017.12.20 개봉 2020.05.21 (재개봉)
 104분, 12세이상관람가
감독 마이클 그레이시 주연 휴 잭맨, 잭 에프론
예매 5위 누적관객1,667,104명 
도움말


에어로너츠(2019)상영중
The Aeronauts 평점 08 . 3
드라마/어드벤처
영국, 미국
2020.06.10 개봉
 101분, 12세이상관람가
감독 톰 하퍼 주연 펠리시티 존스, 에디 레드메인
예매 13위 누적관객73,938명 
도움말
 * 
 */
public class 변수설정 {

	public static void main(String[] args) {
		// 제목
		String title = "위대한 쇼맨(2017)";
		boolean isOpen = true;
		double score = 9.7;
		String nation = "미국";
		String genre = "뮤지컬/드라마";
		String regdate = "2020.05.21";
		String director = "톰 하퍼";
		String actor = "펠리시티 존스, 에디 레드메인";
		int time = 101;
		int grade = 12;
		int rank = 13;
		int showUser = 73938;
		
		System.out.println("========== 영화 정보 ==========");
		System.out.print("영화명 : " + title);
		System.out.println(" " + (isOpen == true?"상영중":"미개봉"));
		System.out.println(nation + " " + grade + "세");
		System.out.println("시간 : " + time + "분");
		System.out.println("개봉일 : " + regdate + "개봉");
		System.out.println("감독 : " + director);
		System.out.println("출연 : " + actor);
		System.out.println("순위 : " + rank);
		System.out.println("누적 관객 : " + showUser + "명");
		
		
		title = "에어로너츠(2019)";
		isOpen = true;
		score = 8.3;
		nation = "영국, 미국";
		genre = "드라마/어드벤처";
		regdate = "2020.06.10";
		director = "마이클 그레이시";
		actor = "휴 잭맨";
		time = 104;
		grade = 12;
		rank = 5;
		showUser = 1667104;
		
		System.out.println("========== 영화 정보 ==========");
		System.out.print("영화명 : " + title);
		System.out.println(" " + (isOpen == true?"상영중":"미개봉"));
		System.out.println(nation + " " + grade + "세");
		System.out.println("시간 : " + time + "분");
		System.out.println("개봉일 : " + regdate + "개봉");
		System.out.println("감독 : " + director);
		System.out.println("출연 : " + actor);
		System.out.println("순위 : " + rank);
		System.out.println("누적 관객 : " + showUser + "명");
		
	}

}
