package com.sist.exception;
/* 
 * 	�� ����ó��
 * 		1. �ڹ��� ��� �ҽ����� ����ó���� ����
 * 		���α׷� ��������� ���۵� / ������������ ���� => ����
 */
public class MainClass {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;	// �����̹Ƿ� catch�� �̵�
			System.out.println("c = " + c);		// ���� �ȵǴ� ����
		}
		catch(Exception e) {
			System.out.println("�����߻�");
		}
		System.out.println("���α׷� ���� ����");
	
//		int a = 10;
//		int b = 0;
//		int c = a/b;
//		System.out.println("c = " + c);
//		System.out.println("���������� ���α׷� ����");

	}
}
