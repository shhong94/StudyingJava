/*
 *  ����ڰ� �����Է�
 *  ¦�� Ȧ�� �Ǵ��ϴ� �޼ҵ�
 */
import java.util.*;
public class �ڹٸ޼ҵ�3����2 {
	// ���� �Է¹޴� �޼ҵ�
	static int userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 1���� �Է� : ");
		int input = scan.nextInt();
		return input;
	}
	
	// Ȧ¦ �Ǵ��ϴ� �޼ҵ�
	static void isOddEven(int input) {
		if(input % 2 == 0) {
			System.out.println(input + "(��)�� ¦���Դϴ�");
		}
		else {
			System.out.println(input + "(��)�� Ȧ���Դϴ�");
		}
	}

	public static void main(String[] args) {
		isOddEven(userInput());

	}

}
