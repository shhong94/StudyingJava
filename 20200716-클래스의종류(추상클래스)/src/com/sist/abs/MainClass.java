package com.sist.abs;

/*
 *  �� �߻�Ŭ����
 *  	�̿ϼ��̶� new�� ����Ͽ� �޸� �Ҵ� �Ұ�
 *  	�׻� ��ӳ��� �� ����Ŭ�������� ����
 *  	�⺻ Ʋ�� ����
 *  	���ø� ��(���������� ���α׷����� �ٸ� �� ����)
 *  
 *   (��)
 *  	1. �Խ����� ������
 *  	2. �Խ����� ����µ� �۾��� ���뺸�� ���� ���� ����� ������  <== �߻�Ŭ���� (��ü���� ��� ����)
 *  
 *   (��)
 *   	��ȭ��
 *   		��ȭ���, ����, �󼼺���, �̺�Ʈ ��
 *   			===> CGV, �ް��ڽ�, �Ե��ó׸�
 *  
 */

abstract class ����{
	public abstract void draw();	// �̱��� �޼ҵ� (��� �ڽ�Ŭ�������� �����ؾߵ�)
	public void color() {			// ������ �޼ҵ�
		System.out.println("���������� �׸��� �׸���");	// �ڽ�Ŭ�������� ���� �׸��� �޼ҵ� ���� ����
	}												// �θ�Ŭ�������� �������̶�� ����Ʈ ����
}

class �ﰢ�� extends ����{

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
		
	}
}


class �� extends ����{

	@Override
	public void draw() {
		System.out.println("���� �׸���");
		
	}

	@Override
	public void color() {					// ������
		System.out.println("���������� �׸��� �׸���");
	}
	
	
}
class �簢�� extends ����{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���");
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		���� g = new �ﰢ��();		// ������ �ڽ�Ŭ������ �̿��� �޸� �Ҵ�
		g.color();
		g.draw();
		
		g = new �簢��();
		g.color();
		g.draw();
		
		g = new ��();
		g.color();
		g.draw();
//============================== ���� Ŭ���� �ϳ��� �ﰢ��, �簢��, �� Ŭ������ ����
//								 ���� Ŭ�������� �ϳ��� Ŭ������ ����

	}

}
