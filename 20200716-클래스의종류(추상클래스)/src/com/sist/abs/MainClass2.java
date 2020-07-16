package com.sist.abs;
/*
 * 	�� �Խ���				�� �������
 * 	1. �亯��		===> 	�亯�ϱ�
 * 	2. �����		===> 	��۴ޱ�
 * 	3. ��������	===> 	���ε�
 * 	4. �ڷ��		===> 	���ε�, �ٿ�ε�
 * 
 * 	�� �Խ����� ������
 * 		1. �۾���	   ]===== �Խ��Ǻ��� ����� �޶� ���� ��
 * 		2. ���뺸��    ]
 * 		3. ����	}
 * 		4. ����	}====== ��� �Խ����̳� �����Ͽ� �������� ��
 * 		5. ã��	}
 * 
 * 	���� ��� �߿���
 * 	�ڽ�Ŭ�������� ����� ���ݾ� �ٸ��� ���� �ϰ�
 * 	�ڽ�Ŭ�������� ������ ����� �������� ��
 */


abstract class Board{
	public abstract void write();		// �۾��� ����
	public abstract void content();		// ���뺸�� ����
	
	public void update() {					// ���� ����
		System.out.println("�Խù� ����");
	}				
	public void delete() {					// ���� ����
		System.out.println("�Խù� ����");
	}				
	public void find() {					// ã�� ����
		System.out.println("�Խù� ã��");
	}				
}

class ReplyBoard extends Board{
	@Override
	public void write() {
		System.out.println("�۾���");
	}
	@Override
	public void content() {
		System.out.println("���뺸��");
	}		
	// Board Ŭ������ ����� ������ ����
}

class DataBoard extends Board{
	@Override
	public void write() {
		System.out.println("�۾��� + ���ε�");		
	}

	@Override
	public void content() {
		System.out.println("���뺸�� + �ٿ�ε�");		
	}
}

class GalleryBoard extends Board{

	@Override
	public void write() {
		System.out.println("�۾��� + �̹��� ���ε�");
	}

	@Override
	public void content() {
		System.out.println("���뺸�� + �̹��� �ٿ�ε�");
	}
}

class ReplyBoard2 extends Board{

	@Override
	public void write() {
		System.out.println("�۾���");
	}

	@Override
	public void content() {
		System.out.println("���뺸�� + ����߰�");
	}		
	
}






public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("===== �亯�� =====");
		Board b = new ReplyBoard();
		b.write();
		b.content();
		System.out.println("===== �������� =====");
		b = new GalleryBoard();
		b.write();
		b.content();
		System.out.println("===== �ڷ�� =====");
		b = new DataBoard();
		b.write();
		b.content();
		System.out.println("===== ����� =====");
		b = new ReplyBoard2();
		b.write();
		b.content();

	}

}
