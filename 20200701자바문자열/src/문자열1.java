/*
 * 	���ڿ� �� : equals()
 *	��ҹ��ڱ��о��� ���ڿ��� : equalsIgnoreCase()
 *
 * 	����ã�� : contains()
 * 	���۹��ڿ� : startsWith()
 * 	�����¹��ڿ� : endsWith()
 * 	���ڿ� �ڸ��� : substring()
 * 	���鹮������ : trim()
 * 	������ġã�� : indexOf(), lastIndexOf()
 * 	����ȯ : valueOf()
 * 	
 */

// �α��� ó��(���ڿ� �� equals(), equalsIgnoreCase())
import java.util.*;
public class ���ڿ�1 {

	public static void main(String[] args) {
		// ID, PW
		final String ID = "admin";
		final String PW = "1234";
		
		// ���̵� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = scan.nextLine();
		
		// ��й�ȣ �Է�
		System.out.print("�н����带 �Է� : ");
		String pw = scan.nextLine();
		
		// ���
		if(id.equalsIgnoreCase(ID) && pw.equals(PW)) {
			System.out.println("�α��� �Ǿ����ϴ�");
		}
		else {
			System.out.println("���̵� Ȥ�� �н����尡 Ʋ���ϴ�");
		}
/*
 *  String���� ==�� ����Ͽ� ���ϸ� �ּ� ���� ���� �ƴ϶� �ּҸ��� ����(���� ������ �ּҴ� �� String���� �� �ٸ�)
 */

	}

}
