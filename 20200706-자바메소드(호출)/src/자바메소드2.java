/*
 * 	��Ģ����
 */

import java.util.*;
public class �ڹٸ޼ҵ�2 {
	
	static int plus(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int multi(int a, int b) {
		return a * b;
	}
	
												// �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
	static void div(int a, int b) {				// ��½ÿ� ����� ���� �ִٸ� �޼ҵ� ������ ����ϴ� ���� ����
		if(b == 0) {
			System.out.println("0���� ���� �� ����");
		}
		else {
			System.out.printf("%d / %d = %.2f\n", a, b, (double)a/b);
		}
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
	// ������ �޴� ����
		System.out.print("������ �Է� (+, -, *, /): ");
		String op = scan.next();
		
	// ����, ����, ���� �޼ҵ��� ����� �޴� ����
		int result = 0;
		
		
	// �޼ҵ� ȣ��
		switch(op) {
		case "+":
			result = plus(a, b);
			System.out.printf("%d + %d = %d\n", a, b, result);
			break;
		case "-":
			result = minus(a, b);
			System.out.printf("%d - %d = %d\n", a, b, result);
			break;
		case "*":
			result = multi(a, b);
			System.out.printf("%d * %d = %d\n", a, b, result);
			break;
	// void �޼ҵ�� ������� ���� �ʾƵ� ��
		case "/":
			div(a, b);
			break;
		default:
			System.out.println("�ùٸ� �����ڸ� �Է�");
			break;
		}

	}

}
