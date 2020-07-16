package com.sist.inter;

/*
 * 	◆ 인터페이스
 * 		추상클래스의 일종(추상클래스 단점 보완)
 * 		미완성된 클래스(스스로 메모리 할당 못 함)
 * 		다중상속
 * 		모든 메소드가 abstract(선언만 가능) (JDK 1.8부터는 디폴트 메소드 구현 가능)
 * 		변수 (추상클래스 : 멤버변수  /  인터페이스 : 상수형 변수)
 * 
 * 	★★★ 인터페이스 내의 모든 메소드와 변수는 public 이다 ★★★
 * 		인터페이스 내 메소드 (public abstract 생략) 변수 (public static final 생략)
 * 
 * 	◆ 인터페이스의 상속
 * 		인터페이스 => 인터페이스	extends(인터페이스끼리 확장의 의미)
 * 		인터페이스 => 클래스		implement(미구현된 메소드를 구현하겠다는 의미)
 * 		클래스 => 인터페이스		안됨!!!
 */

interface 동물 {
	void eat();
	default void run() {					// 구현할 때는 디폴트 메소드로!
		System.out.println("네발로 걷는다");
	}
}

class 소 implements 동물{
	public void eat() {
		System.out.println("소같이먹음");
	}
}
class 개 implements 동물{
	public void eat() {
		System.out.println("개같이먹음");
	}
}
class 돼지 implements 동물{
	public void eat() {
		System.out.println("돼지같이먹음");
	}
}



public class MainClass {

	public static void main(String[] args) {
		동물 a = new 소();
		a.eat();
		
		a = new 개();
		a.eat();
		
		a = new 돼지();
		a.eat();

	}

}
