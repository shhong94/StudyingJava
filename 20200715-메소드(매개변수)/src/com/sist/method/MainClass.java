package com.sist.method;

class AA {
	public void AA() {							// �Ϲݸ޼ҵ� (void ����)
		System.out.println("AA() Call...");
	}
	public AA() {								// ������
		System.out.println("AA() Call...");
	}
}

public class MainClass {

	public static void main(String[] args) {
		AA a = new AA();
		a.AA();

	}

}
