package com.sist.lang;

class Change{
	int x, y;
}
// Change x = 0, y = 0;

public class MainClass2 {
	
	public void swap2(Change c){
		int temp = c.x;
		c.x = c.y;
		c.y = temp;
	}
	
	public void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static void main(String[] args) {
		MainClass2 m = new MainClass2();
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		m.swap(x, y);
		System.out.println(x);
		System.out.println(y);	// x,y�� ������ �޸𸮿� swap �Ű������� �޸� ������ �ٸ�
								// �Ϲ� ������ �Ű������� �Ѿ�� Call By Value
		
		Change c = new Change();
		c.x = 10;
		c.y = 20;
		m.swap2(c);
		System.out.println(c.x);	// c.x c.y�� �޸� ������ swap2 �Ű������� �޸� ������ ����
									// Ŭ������ �Ű������� �Ѿ�� Call By Reference
									// String�� ����.
	}

}
