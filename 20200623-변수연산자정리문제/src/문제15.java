import java.util.Scanner;
public class ����15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10�̻� 99 ������ ������ �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		if ((a / 10) - (a % 10) == 0)  // if (a % 11 == 0) ���ε� ����
		{
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}

	}

}
