package com.sist.inter;

interface A{
	public void display();
}

public class MainClass4 {

	public static void main(String[] args) {
		// �ڽ� Ŭ����/�������̽� ���̵� ������ ���ο��� ��ü������ �޸� �Ҵ� ����. �̰� �ٷ� �͸�Ŭ����
		A a = new A() {
			public void display() {
				System.out.println("A : display : Call...");
			}
		};
		a.display();
	}

}
