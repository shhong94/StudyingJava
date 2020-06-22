import java.util.*;
public class 자바조건문_문제2 {

	public static void main(String[] args) {
		// 2번 문제
		
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;
		kor = 0;  // 국어 점수
		eng = 0;  // 영어 점수
		math = 0; // 수학 점수
		
		System.out.print("국어 점수: ");
		kor = scan.nextInt();
		System.out.print("영어 점수: ");
		eng = scan.nextInt();
		System.out.print("수학 점수: ");
		math = scan.nextInt();
		
		// 평균 90 이상 A
		if ((kor + eng + math) / 3 >= 90)
		{
			System.out.printf("총점 : %d \n평균 : %.1f \n학점 : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "A");
		}
		// 평균 80 이상 B
		else if ((kor + eng + math) / 3 >= 80)
		{
			System.out.printf("총점 : %d \n평균 : %.1f \n학점 : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "B");
		}
		// 평균 70 이상 C
		else if ((kor + eng + math) / 3 >= 70)
		{
			System.out.printf("총점 : %d \n평균 : %.1f \n학점 : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "C");
		}
		// 평균 60 이상 D
		else if ((kor + eng + math) / 3 >= 60)
		{
			System.out.printf("총점 : %d \n평균 : %.1f \n학점 : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "D");
		}
		// 나머지 F
		else
		{
			System.out.printf("총점 : %d \n평균 : %.1f \n학점 : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "F");
		}
		
		// 총점, 평균 변수를 상단에 한꺼번에 정리해놨어야.
		// next.Int 부분은   int kor = scan.nextInt(); 라고 선언하면 더 간결함.
		// if문만 써도 문제 해결 가능.
		// 실행문장에는 스코어만 써놓고 평균 총점 학점 sysout 부분은 맨 아래에 하나씩만 적어도 됨.
		

	}

}
