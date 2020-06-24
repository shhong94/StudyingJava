/*
 * 	◆ 다중 조건문
 * =======================================
 * 		if (조건문) {
 * 			실행문장
 * 		}
 *		else if (조건문) {
 * 			실행문장
 * 		}
 * 		else if (조건문) {
 * 			실행문장
 * 		}
 * 		else (조건문) {                      <=============================== 생략가능
 * 			실행문장
 * 		} 
 * =======================================  다중조건문은 한 덩어리로 처리 (조건에 맞는 문장 하나만 수행)
 * 
 * 	◆ 단일 조건문 여러개
 * =======================================
 * 		if (조건문) {
 * 			실행문장
 * 		}
 * =======================================
 *		if (조건문) {
 * 			실행문장
 * 		}
 * =======================================
 * 		if (조건문) {
 * 			실행문장
 * 		}
 * =======================================
 * 		if (조건문) {
 * 			실행문장
 * 		} 
 * =======================================  단일 조건문 여러개는 각각이 별개의 문장을 수행
 */
import java.util.*;
public class 다중조건문 {

	public static void main(String[] args) {
	// 3개 점수를 받아서 총점, 평균, 학점 구하기
		
	// 변수 초기화
		int kor = 0, eng = 0, math = 0;
		int total = 0;
		double avg = 0.0;
		char score = 'A';
	// 점수 3개 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = scan.nextInt();		
	// 총점, 평균 계산
		total = kor + eng + math;
		avg = total / 3.0;
	// 평균에 따른 학점 계산
		if (avg >= 90) {
			score = 'A';
		}
		else if (avg >= 80) {
			score = 'B';
		}
		else if (avg >= 70) {
			score = 'C';
		}
		else if (avg >= 60) {
			score = 'D';
		}
		else {
			score = 'F';
		}
	// 화면 출력
		System.out.println("==========성적==========");
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("학점 : " + score);

	}

}
