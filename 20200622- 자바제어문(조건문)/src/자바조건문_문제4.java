/*
 * �ΰ��� ������ �޾Ƽ�
 * �ִ밪, �ּҰ� 
 * 
 */
import java.util.*;
public class �ڹ����ǹ�_����4 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("���� �� ���� �Է��ϼ��� : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int max, min;
//		
//		if (a > b)
//		{
//			max = a;
//			min = b;
//		}
//		else
//		{
//			max = b;
//			min = a;
//		}
//		
//		System.out.println("max : " + max);
//		System.out.println("min : " + min);
		
		// ������ �Է� �޾� ���밪�� ����ϴ� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		if (num >= 0)
		{
			num = num;
		}	
		else
		{
			num = num * (-1);
		}
		
		System.out.println(num);
	}

}
