/*
 * 	국어 영어 수학점수의
 * 	1. 총점
 * 	2. 평균
 * 	3. 학점
 */
import java.util.*;
public class 자바메소드2응용2 {
	
	// 점수 입력받는 메소드 (3번 호출)
	static int userInput(String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.print(subject + "점수를 입력 : ");
		int score = scan.nextInt();
		return score;
	}
	
	// 총점 출력하는 메소드
	static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	// 평균 메소드
	static void avg(int total) {
		System.out.printf("평균 : %.2f\n", total/3.0);
	}
	
	// 학점 메소드 (리턴값 char)
//	static char grade(int total) {
//		char grade = 'a';
//		switch(total / 3) {
//		case 100:
//		case 90:
//			grade = 'A';
//			break;
//		case 80:
//			grade = 'B';
//			break;
//		case 70:
//			grade = 'C';
//			break;
//		case 60:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}
//		return grade;
//	}
	
	// 학점 메소드 (void)
	static void grade(int total) {
		char grade = 'a';
		if(total / 3.0 >= 90) {
			grade = 'A';
		}
		else if(total / 3.0 >= 80) {
			grade = 'B';
		}
		else if(total / 3.0 >= 70) {
			grade = 'C';
		}
		else if(total / 3.0 >= 60) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("학점 : " + grade);
	}

	public static void main(String[] args) {
		int kor = userInput("국어");
		int eng = userInput("영어");
		int math = userInput("수학");
		int total = total(kor, eng, math);
		
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		
		System.out.println("총점 : " + total);
		avg(total);
		grade(total);
		
		
	}

}
