/*
 * 	◆ 클래스
 * 		1. 저장할 변수 선택
 * 			여러개 저장시 공통으로 들어가는 데이터를 저장 (한우세트에는 한우 부위만 들어가야됨)
 * 					  ================= >> 추상화
 * 		2. 변수 종류
 * 			① 인스턴스변수 : new 사용할 때마다 따로 저장됨
 * 			② 클래스변수 : 저장되는 메모리가 한개이며 공통으로 사용됨 (정적변수) static
 * 			③ 지역변수 : 지역변수 / 매개변수 (메소드 호출 시에 메모리에 저장, 메소드 종료시 메모리에서 사라짐)
 * 
 * 		3. 생성자
 * 			① 인스턴스 변수의 초기값 부여
 * 			② 구현 부분에 필요 (제어문 이용, 파일 읽기...)
 * 			③ 생략 가능(컴파일러가 기본 생성자 추가)			
 * 
 * 		4. 메소드
 * 			① 선언부 + 구현부 이어야 저장
 * 			① 인스턴스 메소드 : 클래스마다 따로 사용하는 메소드
 * 			② 클래스 메소드	: 모든 클래스 공통으로 사용 (static)
 * 			③ 추상메소드 : 선언부만 존재
 * 
 */

class Student{
	String name;
	String subject;
	int year;
	static String school;
}


public class MainClass {

	public static void main(String[] args) {
		// static 변수 사용
		Student.school = "SIST";
		Student s = new Student(); // name, subject, year 변수들이 지금 저장
		s.name = "아무개";
		s.subject = "라디오가과";
		s.year = 3;
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);

		
	}

}
