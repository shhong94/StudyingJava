/*
 * 	2~9 ����ڰ� �Է��Ͽ� 
 * 	������ ���
 */
import java.util.*;
public class �ݺ���_for2 {

	public static void main(String[] args) {
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2�� 9 ������ ������ �� �� �Է��ϼ��� : ");
		input = scan.nextInt();
		
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, (input * i));
		}

	}

}
