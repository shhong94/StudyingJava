package com.sist.inter;

interface A{
	public void display();
}

public class MainClass4 {

	public static void main(String[] args) {
		// 자식 클래스/인터페이스 없이도 생성자 내부에서 자체적으로 메모리 할당 가능. 이게 바로 익명클래스
		A a = new A() {
			public void display() {
				System.out.println("A : display : Call...");
			}
		};
		a.display();
	}

}
