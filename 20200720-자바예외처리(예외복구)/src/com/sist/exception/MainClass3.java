package com.sist.exception;

public class MainClass3 {

	public static void main(String[] args) {
		// �κ������� try~catch ��밡��
		try {
			for(int i = 1; i <= 10; i++) {
				int a = i/(int)(Math.random()*3);	// ����
				System.out.println("a = " + a);
			}
		}catch(Exception ex){
			System.out.println("for�� i++�� �̵�");
		}
		System.out.println("��������");
	}

}
