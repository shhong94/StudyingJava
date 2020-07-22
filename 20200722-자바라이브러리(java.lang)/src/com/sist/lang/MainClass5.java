package com.sist.lang;

/*
 * 	finalize() : 소멸자
 */

class C {
	public void display() {
		System.out.println("C : display() Call...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("메모리 해제");
	}
	
}

public class MainClass5 {

	public static void main(String[] args) {
		C c = new C();
		c.display();
		c = null;	// finalize() 메소드는 개발자가 호출하는 것이 아니라, 메모리 할당이 해제된 후에 스스로 호출됨
		System.gc();	// c가 null이 되면 가비지컬렉션 대상임.
						// 가비지컬렉션을 통한 자연스러운 메모리 회수가 아니라면, 한참 뒤에 회수가 실행되어 퍼포먼스가 낮아짐.
	}

}
