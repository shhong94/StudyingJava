import java.util.*;
public class �ڹ����ǹ�_����2 {

	public static void main(String[] args) {
		// 2�� ����
		
		Scanner scan = new Scanner(System.in);

		int kor, eng, math;
		kor = 0;  // ���� ����
		eng = 0;  // ���� ����
		math = 0; // ���� ����
		
		System.out.print("���� ����: ");
		kor = scan.nextInt();
		System.out.print("���� ����: ");
		eng = scan.nextInt();
		System.out.print("���� ����: ");
		math = scan.nextInt();
		
		// ��� 90 �̻� A
		if ((kor + eng + math) / 3 >= 90)
		{
			System.out.printf("���� : %d \n��� : %.1f \n���� : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "A");
		}
		// ��� 80 �̻� B
		else if ((kor + eng + math) / 3 >= 80)
		{
			System.out.printf("���� : %d \n��� : %.1f \n���� : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "B");
		}
		// ��� 70 �̻� C
		else if ((kor + eng + math) / 3 >= 70)
		{
			System.out.printf("���� : %d \n��� : %.1f \n���� : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "C");
		}
		// ��� 60 �̻� D
		else if ((kor + eng + math) / 3 >= 60)
		{
			System.out.printf("���� : %d \n��� : %.1f \n���� : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "D");
		}
		// ������ F
		else
		{
			System.out.printf("���� : %d \n��� : %.1f \n���� : %s", (kor + eng + math), (double)(kor + eng + math) / 3, "F");
		}
		
		// ����, ��� ������ ��ܿ� �Ѳ����� �����س����.
		// next.Int �κ���   int kor = scan.nextInt(); ��� �����ϸ� �� ������.
		// if���� �ᵵ ���� �ذ� ����.
		// ���๮�忡�� ���ھ ����� ��� ���� ���� sysout �κ��� �� �Ʒ��� �ϳ����� ��� ��.
		

	}

}
