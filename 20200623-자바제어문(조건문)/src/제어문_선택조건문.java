/*
 * 	�� ���� ���ǹ�
 * 		if(���ǹ�)
 * 		{
 * 			���ǹ��� true�� �� �����ϴ� ����
 * 		}
 *  	else
 * 		{
 * 			���ǹ��� false�� �� �����ϴ� ����
 * 		}
 * 
 * 	�� ���ڿ��� !=, ==�� ������� ����.
 * 		equals(), !equals() ���. (equals�� ������ ������ �ּ� ���� �����Ͱ��� '����' ���� �� ���)
 * 		!=, ==�� �����Ͱ��� ����Ǿ� �ִ� �ּҸ� ���� �� ���
 */
import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// ���� 1���� �Է¹޾Ƽ� ���ĺ� ���� Ȯ��
		
		Scanner scan = new Scanner(System.in);
		
		char a = '0';
		
		System.out.print("1�� �ڸ� ���� 1���� �Է��ϼ��� : ");
		a = scan.next().charAt(0);  // charAt(0) : "ABC" �߿��� 0��°�� A ���.
				
		if (a >= '0' && a <= '9') {
			System.out.println(a + "��(��) ���ڰ� �½��ϴ�.");
		}
		else {
			System.out.println(a + "��(��) �����Դϴ�.");
		}
		// ������ �������, �������� ���ڶ�� ���
	}

}
