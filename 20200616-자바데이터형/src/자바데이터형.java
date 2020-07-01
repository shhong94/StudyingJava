/*
 *  자바에서 사용하는 데이터형 => 메모리의 크기 지정
 *  ==================================
 *  	컴퓨터는 0, 1 => bit
 *  
 *  정수
 *   - byte => -128 ~ +127 (파일 읽기/쓰기/업로드/다운로드, 네트워크 전송)
 *   - short => -32768 ~ +32767 (C언어와 호환성 유지 목적, 사용빈도 ↓)
 *   - int => -21억4천 ~ +21억4천 (정수는 컴퓨터에서 기본적으로 int로 인식, 쪼개거나 합치지 않아도 되어 속도 ↑)
 *   - long => (빅데이터, 금융권, 주식 등)
 *   
 *  실수
 *   - float => 소수점 6자리 4byte
 *   - double => 소수점 15자리 8byte (실수는 컴퓨터에서 기본적으로 double로 인식)
 *   ★ 변수(저장공간) = (첨부할 값)
 *     해석) 첨부할 값을 저장공간에 집어넣어라. 따라서 "저장공간"이 "첨부할 값"보다 같거나 커야 함.
 *     ex) double = float
 *  
 *  문자
 *   - char 2byte => 0 ~ 65535 음수 없이 양수만.
 *     * A = 65
 *       a = 97
 *       0 = 49
 *       
 *  논리
 *   - true/false 저장 (1byte) => boolean
 *   
 *  메모리에 저장하는 크기
 *   byte < short < int < long < float < double
 *          char
 *   
 */


public class 자바데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 80;
		int eng = 80;
		int math = 80;
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + math + "점");
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg);
		if (avg >= 80) {
			char score = 'B';
			System.out.println(score);
		}
	}

}
