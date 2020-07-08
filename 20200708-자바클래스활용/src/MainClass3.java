/*
 *  성적계산
 */

import java.util.*;

// 학생 클래스
class Student{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}

public class MainClass3 {

	static void process() {
		Student[] std = new Student[3];		// Student 클래스 배열
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < std.length; i++) {
			std[i] = new Student();		// 클래스의 초기값은 null(주소없음)이기 때문에 생성자를 통해 메모리에 저장공간을 만들어줘야 에러가 나지 않음 (동적 메모리 할당)
			
			System.out.print("이름 입력 : ");
			std[i].name = scan.next();
			
			System.out.print("국어점수 입력 : ");
			std[i].kor = scan.nextInt();
			System.out.print("영어점수 입력 : ");
			std[i].eng = scan.nextInt();
			System.out.print("수학점수 입력 : ");
			std[i].math = scan.nextInt();
			
			std[i].total = std[i].kor + std[i].eng + std[i].math;
			std[i].avg = std[i].total / 3.0;
		}
		
		// 출력
		for(Student s : std) {
			System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math + " " + s.total + " " + s.avg);
		}
	}
	public static void main(String[] args) {
		process();

	}

}
