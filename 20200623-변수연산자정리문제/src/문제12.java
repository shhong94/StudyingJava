/*
 * 	Ǯ�� ����
 *  ���� ���� => ���� ó�� => ó����� ���
 */

import java.util.Scanner;
public class ����12 {

	public static void main(String[] args) {

		// ���� �����Ͽ� �޸𸮿� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �ΰ��� �Է��ϼ��� : ");
		int a = scan.nextInt();	// ����ڰ� �Է��� ���� ������ ����
		int b = scan.nextInt();	// ����ڰ� �Է��� ���� ������ ����
		
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
	}

}
