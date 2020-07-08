import java.util.Scanner;

/*
 * 		0		1		2		3		4
 * 
 *  ==============================================
 * 		1				2				3				0
 * 	==============================================
 * 				4				5						1	
 * 	==============================================
 * 		6				7				8				2
 * 	==============================================
 * 				9				10						3
 * 	==============================================
 * 		11				12				13				4
 * 	==============================================	
 */
import java.util.*;
public class ���� {
// ======================================================================================================= ���� ���� �޼ҵ�
	static int[] getRandom() {
		int[] com = new int[3];
		int random = 0;
		// ���� �ߺ�üũ
		boolean check = false;
		for(int i = 0; i < com.length; i++) {
			check = true;
			while(check) {
				random = (int)(Math.random()*9)+1;
				check = false;
				for(int j = 0; j < i; j++) {
					if(random == com[j]) {
						check = true;
						break;
					}
				}
			}
			com[i] = random;
		}
		return com;
	}
	
//=========================================================================================================== �Է¹޴� �޼ҵ�
	static int[] userInput() {
		int[] user = new int[3];
		// �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ������ �Է��ϼ��� : ");
			int input = scan.nextInt();
			// ����üũ
			if(input < 100 || input > 999) {
				System.out.println("100�� 999������ ������ �Է��ϼ���");
				continue;
			}
			// �ߺ�üũ
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
				System.out.println("���ڴ� �ߺ��ǰ� �Է��� �� �����ϴ�");
				continue;
			}
			break;
		}
		return user;
	}
	
//=========================================================================================================== ��Ʈ ��� �޼ҵ�
	static void hint(int[] com, int[] user) {
		// ��
		int s = 0;
		int b = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(com[i] == user[j]) {
					if(i == j) {
						s++;
					}
					else {
						b++;
					}
				}
			}
		}
		
		System.out.println("================= ��Ʈ =================");
		System.out.print("S : ");
		for(int i = 0; i < s; i++) {
			System.out.print("��");
		}
		System.out.println();
		System.out.print("B : ");
		for(int i = 0; i < b; i++) {
			System.out.print("��");
		}
		if(isEnd(s)) {
			System.out.println("����!!!!!");
			System.exit(0);
		}
		
		System.out.println();
	}
	
//=========================================================================================================== ���Ῡ��Ȯ�� �޼ҵ�
	static boolean isEnd(int s) {
		if(s == 3) {
			return true;
		}
		else {
			return false;
		}
	}

//=========================================================================================================== process �޼ҵ�
	static void process() {
		int[] com = getRandom();
		
		while(true) {
			int[] user = userInput();
			hint(com, user);
		}
	}
	
	public static void main(String[] args) {
		process();
	}
}
