package com.sist.exception;
/*
 * 	�� ���� ȸ��
 * 		1. ����
 * 			���� ������ �����ϰ� ��
 * 			�����ڷ� �Ͽ��� ���� ���α׷��� �°� ó���ϵ��� ����
 *		2. ����
 *			�޼ҵ�() throws �����ѿ���Ŭ����(�������� ��������)
 *			=> �ش��ϴ� �޼ҵ忡�� ���� ó��
 */
public class MainClass {
	public int div(int a, int b) throws ArithmeticException {
		return a / b;
	}
	
	public static void main(String[] args) {
		MainClass m = new MainClass();
		System.out.println(m.div(2, 0));	// <=========== ��Ÿ�� ���ܴ� ��������
	}

}
