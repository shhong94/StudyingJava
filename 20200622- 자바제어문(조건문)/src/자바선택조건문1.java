/*
 * 	���� ���ǹ� : if ~ else
 * 	�� ����
 * 		if (���ǹ�)
 * 		{
 * 			���๮��    <=========================== ������ true�� �� �����ϴ� ����
 * 		}
 * 		else (���ǹ�)
 * 		{
 * 			���๮��    <=========================== ������ false�� �� �����ϴ� ����
 * 		}
 * 
 * 	�� ���ӻ�
 * 		�α��� ó��, ���̵� �ߺ�üũ, �۾���(����/���), ¦��/Ȧ��, �빮��/�ҹ���
 */
import java.util.Scanner;
public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		//Scanner�� ���� => Ű������ �Է°��� �ִ� ��쿡 ����.
		Scanner scan = new Scanner(System.in);  //System.in ����� Ű���� �Է°��� �޴´�
												//System.out ����Ϳ� ��½� ���
		System.out.print("������ �Է�(1~100): ");
		int a = scan.nextInt();  //�Էµ� ���� �޾Ƽ� a��� �޸� ������ ����
		
		if (a < 1 || a > 100)
		{
			System.out.println("�߸��� �Է��Դϴ�.\n���α׷��� �����մϴ�.");
		}
		else
		{
			System.out.println(a + "(��)�� �ԷµǾ����ϴ�.");
		}
		
	}

}
