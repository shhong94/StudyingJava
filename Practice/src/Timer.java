import java.util.*;
public class Timer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ��: ");
		int hour = scan.nextInt();
		System.out.print("���� ��: ");
		int minute = scan.nextInt();
		
		// 960 - ((hour * 60) + minute)
		int left = 960 - ((hour * 60) + minute);
		int left_hour = left / 60;
		int left_minute = left % 60;
		
		System.out.printf("������ %d�ð� %d�� ���ҽ��ϴ�.", left_hour, left_minute);

	}

}
