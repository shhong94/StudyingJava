package com.sist.method;

class AA {
	public void AA() {							// 일반메소드 (void 있음)
		System.out.println("AA() Call...");
	}
	public AA() {								// 생성자
		System.out.println("AA() Call...");
	}
}

public class MainClass {

	public static void main(String[] args) {
		AA a = new AA();
		a.AA();

	}

}
