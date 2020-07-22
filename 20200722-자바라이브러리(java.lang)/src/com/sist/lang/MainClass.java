package com.sist.lang;

// clone() 메소드는 변경된 값(변수 등)도 함께 복제		(변경된 것부터 시작)
// new는 초기 선언된 값으로 메모리 생성   	(처음부터 시작)

class A implements Cloneable{
	int aa = 10;
	
	public A clone () {
		A a = new A();
		try {
			a = (A)super.clone();		// clone() 반환타입은 Object이므로 클래스 A로 형변환 필요
		}catch(Exception e) {}
		return a;
	}
}

public class MainClass {

	public static void main(String[] args) {
		A a = new A();	 // a.aa		a와 b는 별개의 저장 장소
		A b = new A();	// b.aa
		
		
		// 별칭, 같은 메모리 참조
		A c = new A();
		A d = c;		// c와 d는 같은 메모리		c와 d는 같은 저장 장소
	}

}
