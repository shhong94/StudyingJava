import java.util.Scanner;

public class ���ھ߱�_Ŭ����������� {
// Ŭ���� ���� �ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ� Ŭ���� ����
	static int[] com = new int[3];
	static int random = 0;
	static int[] user = new int[3];
	static int input = 0;
	static int s = 0;
	static int b = 0;
	
// ���������ϴ� ���� =================================================================================================== ���������ϴ� ����
	
	static int[] getRandom() {
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
	
// �Է¹ް� ����üũ�ϴ� �޼ҵ� ======================================================================================= �Է¹ް� ����üũ�ϴ� �޼ҵ�
	static int[] userInput() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ������ �Է��ϼ��� : ");
			input = scan.nextInt();
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
	
// �� �� ��Ʈ ����ϴ� �޼ҵ� ==================================================================================== �� �� ��Ʈ ����ϴ� �޼ҵ�
	static void hint() {
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
		System.out.println();
		
		if (isEnd() == true) {
			System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ� ���� �ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
			System.exit(0);
		}
	}
	
// ���Ῡ�� Ȯ���ϴ� �޼ҵ� ====================================================================================== ���Ῡ�� Ȯ���ϴ� �޼ҵ�
	static boolean isEnd() {
		boolean check = false;
		if(s == 3) {
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
	
// ���μ��� ================================================================================================= ���μ���
	static void process() {
		int[] com = getRandom();
		
		while(true) {
			int[] user = userInput();
			hint();
		}
	
	}
	
	public static void main(String[] args) {
		process();

	}

}
