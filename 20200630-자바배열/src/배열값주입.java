/*
 * 	◆ 배열에 값 주입
 * 		1. 직접 주입
 * 		2. Scanner사용
 * 		3. 난수를 이용
 * 		4. file 읽기
 * 		5. web에서 읽어서 주입
 * 		6. 오라클
 */
import java.util.*;
public class 배열값주입 {

	public static void main(String[] args) {
		// 학생 3명의 성적관리
		// 국어 영어 수학점수 입력받고 총점 평균 학점 등수
		
		// 변수
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		// 총점 평균 학점 등수
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		
		// 각 점수를 입력받고 총점, 평균 구하기
		for(int i = 0; i <3; i++) {
			System.out.printf("%d번째 국어 점수 입력 : ", i+1);
			kor[i] = scan.nextInt();
		
			System.out.printf("%d번째 영어 점수 입력 : ", i+1);
			eng[i] = scan.nextInt();
			
			System.out.printf("%d번째 수학 점수 입력 : ", i+1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
		}
		
		// 학점계산
		for(int i = 0; i < 3; i++) {
			char c = 'A';
			switch(total[i] / 30) {
			case 10:
			case 9:
				c = 'A';
				break;
			case 8:
				c = 'B';
				break;
			case 7:
				c = 'C';
				break;
			case 6:
				c = 'D';
				break;
			default:
				c = 'F';
				break;
			}
			score[i] = c;
		}
		//등수 계산
		for(int i = 0; i < 3; i++) {
			rank[i] = 1;
			for(int j = 0; j < 3; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.printf("%-6s%-6s%-6s%-7s%-7s%-3s%6s\n", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		// 입력된 점수 출력
		for(int i = 0; i < 3; i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%5d\n", kor[i], eng[i], math[i], total[i], avg[i], score[i], rank[i]);
		}
		
	}

}
