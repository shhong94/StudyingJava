package com.sist.inter;

/*
 * 	�� �������̽�
 * 		�߻�Ŭ������ ����(�߻�Ŭ���� ���� ����)
 * 		�̿ϼ��� Ŭ����(������ �޸� �Ҵ� �� ��)
 * 		���߻��
 * 		��� �޼ҵ尡 abstract(���� ����) (JDK 1.8���ʹ� ����Ʈ �޼ҵ� ���� ����)
 * 		���� (�߻�Ŭ���� : �������  /  �������̽� : ����� ����)
 * 
 * 	�ڡڡ� �������̽� ���� ��� �޼ҵ�� ������ public �̴� �ڡڡ�
 * 		�������̽� �� �޼ҵ� (public abstract ����) ���� (public static final ����)
 * 
 * 	�� �������̽��� ���
 * 		�������̽� => �������̽�	extends(�������̽����� Ȯ���� �ǹ�)
 * 		�������̽� => Ŭ����		implement(�̱����� �޼ҵ带 �����ϰڴٴ� �ǹ�)
 * 		Ŭ���� => �������̽�		�ȵ�!!!
 */

interface ���� {
	void eat();
	default void run() {					// ������ ���� ����Ʈ �޼ҵ��!
		System.out.println("�׹߷� �ȴ´�");
	}
}

class �� implements ����{
	public void eat() {
		System.out.println("�Ұ��̸���");
	}
}
class �� implements ����{
	public void eat() {
		System.out.println("�����̸���");
	}
}
class ���� implements ����{
	public void eat() {
		System.out.println("�������̸���");
	}
}



public class MainClass {

	public static void main(String[] args) {
		���� a = new ��();
		a.eat();
		
		a = new ��();
		a.eat();
		
		a = new ����();
		a.eat();

	}

}
