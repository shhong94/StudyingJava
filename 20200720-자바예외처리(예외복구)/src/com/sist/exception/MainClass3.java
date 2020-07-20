package com.sist.exception;

public class MainClass3 {

	public static void main(String[] args) {
		// 부분적으로 try~catch 사용가능
		try {
			for(int i = 1; i <= 10; i++) {
				int a = i/(int)(Math.random()*3);	// 에러
				System.out.println("a = " + a);
			}
		}catch(Exception ex){
			System.out.println("for문 i++로 이동");
		}
		System.out.println("정상종료");
	}

}
