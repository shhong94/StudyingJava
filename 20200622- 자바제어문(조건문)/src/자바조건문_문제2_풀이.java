import java.util.*;
public class 자바조건문_문제2_풀이 {

	public static void main(String[] args) {
		// 2번 문제
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		char score = 'A';
		
		if (avg >= 90 && avg <= 100) 
		{
			score = 'A';
		}
		if (avg >= 80 && avg < 90) 
		{
			score = 'B';
		}
		if (avg >= 70 && avg < 80) 
		{
			score = 'C';
		}
		if (avg >= 60 && avg < 70) 
		{
			score = 'D';
		}
		if (avg < 60) 
		{
			score = 'F';
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + score);
	}

}
