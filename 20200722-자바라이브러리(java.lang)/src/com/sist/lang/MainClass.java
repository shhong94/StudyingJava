package com.sist.lang;

// clone() �޼ҵ�� ����� ��(���� ��)�� �Բ� ����		(����� �ͺ��� ����)
// new�� �ʱ� ����� ������ �޸� ����   	(ó������ ����)

class A implements Cloneable{
	int aa = 10;
	
	public A clone () {
		A a = new A();
		try {
			a = (A)super.clone();		// clone() ��ȯŸ���� Object�̹Ƿ� Ŭ���� A�� ����ȯ �ʿ�
		}catch(Exception e) {}
		return a;
	}
}

public class MainClass {

	public static void main(String[] args) {
		A a = new A();	 // a.aa		a�� b�� ������ ���� ���
		A b = new A();	// b.aa
		
		
		// ��Ī, ���� �޸� ����
		A c = new A();
		A d = c;		// c�� d�� ���� �޸�		c�� d�� ���� ���� ���
	}

}
