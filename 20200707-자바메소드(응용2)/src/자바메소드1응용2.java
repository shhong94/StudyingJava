/*
 * 	����ڰ� �⵵�� �Է��ϸ� ���� ���� ���	
 */
import java.util.*;
public class �ڹٸ޼ҵ�1����2 {
	
	// ���� �Է� �޼ҵ�
		static int userInput() {
			Scanner scan = new Scanner(System.in);
			System.out.print("������ �Է��Ͻÿ� : ");
			int year = scan.nextInt();
			return year;
		}
	
	// ���� ���� Ȯ�� �޼ҵ�
//		static boolean isLeapYear(int year) {
//			boolean check = false;
//			if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
//				check = true;
//			}
//			else {
//				check = false;
//			}
//			return check;
//		}
		
		static void isLeapYear(int year) {
			if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
				System.out.println("�����Դϴ�");
			}
			else {
				System.out.println("������ �ƴմϴ�");
			}
		}
		
		
	
	
	public static void main(String[] args) {
		

	}

}
