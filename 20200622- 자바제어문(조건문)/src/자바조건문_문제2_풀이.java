import java.util.*;
public class �ڹ����ǹ�_����2_Ǯ�� {

	public static void main(String[] args) {
		// 2�� ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int kor = scan.nextInt();
		System.out.print("���� ����: ");
		int eng = scan.nextInt();
		System.out.print("���� ����: ");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		char score = 'A';
		
		if (avg >= 90 && avg <= 100) 
		{
			score = 'A';
		}
		if (avg >= 80 && avg < 90) 
		{
			score = 'B';
		}
		if (avg >= 70 && avg < 80) 
		{
			score = 'C';
		}
		if (avg >= 60 && avg < 70) 
		{
			score = 'D';
		}
		if (avg < 60) 
		{
			score = 'F';
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + score);
	}

}
