/*	��Ģ����
 *  ���� : ���� 2��, ������(+ - * /)
 */
import java.util.*;
public class �������ǹ�3 {

	public static void main(String[] args) {
	// ���� �ʱ�ȭ
		int a = 0, b = 0;
		char op = '+';
	// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("�����ڸ� �Է��ϼ��� (+ - * /) : ");
		op = scan.next().charAt(0);
		
		if (op == '+') {
			System.out.printf("%d + %d = %d", a, b, (a + b));
		}
		else if (op == '-') {
			System.out.printf("%d - %d = %d", a, b, (a - b));
		}
		else if (op == '*') {
			System.out.printf("%d * %d = %d", a, b, (a * b));
		}
		else if (op == '/') {
			if (b == 0) {
				System.out.printf("0���� ���� �� �����ϴ�");
			}
			else {
				System.out.printf("%d / %d = %.2f\n", a, b, (a / (double)b));
			}
				
		}
		else {
			System.out.println("�߸��� ������ �Է��Դϴ�");
		}
		
	}

}
