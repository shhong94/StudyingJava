/*
 *  1. ������
 *  	1) �������� ����
 *  	2) ���� ���
 *  	3) ������ �켱����
 */

public class ���׿�����_���������� {

	public static void main(String[] args) {
		//��ġ����
		int a = 10;
		int b = ++a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 10;
		b = a++ + a++ + a++ + a++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
