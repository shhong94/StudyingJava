import java.util.Scanner;

public class ����_���ھ߱�_�޼ҵ� {
	// Ŭ���� ����
	static int[] arr = new int[3];
	static int random = 0;
	// �Է°��� ������ �迭
	static int[] user = new int[3];
	// �Է°��� �ӽ������� ����
	static int input = 0;

	static void padding (int[] arr) {
		

		boolean check = false;
		for(int i = 0; i < 3; i++) {
			check = true;
			while(check) {
				random = (int)(Math.random()*9)+1;
				check = false;
				for(int j = 0; j < i; j++) {
					if(arr[j] == random) {
						check = true;
						break;
					}
				}
			}
			arr[i] = random;
		}
	}
	
	static void print() {
		while(true) {
			Scanner scan = new Scanner(System.in);
			// 2. �Է°� �ޱ�
			System.out.print("3�ڸ� ������ �Է��ϼ��� : ");
			input = scan.nextInt();
			// 3. ���� üũ
			if(input < 100 || input > 999) {
				System.out.println("100�� 999������ ������ �Է��ϼ���");
				continue;
			}
			// 4. �ߺ� üũ
			user[0] = input / 100;
			user[1] = (input%100) / 10;
			user[2] = input % 10;
			if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
				System.out.println("�ߺ��� ���ڸ� �Է��� �� �����ϴ�.");
				continue;
			}
			
			// 5. ��
			int s = 0;
			int b = 0;
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(arr[i] == user[j]) {
						if(i == j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			
			// ��Ʈ ���
			System.out.println("=========== ��Ʈ ===========");
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
			
			// ����
			if(s == 3) {
				System.out.println("�����Դϴ�!");
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
	// ���� ����
		padding(arr);
	// �����迭 ���
		for(int i : arr) {
			System.out.println(i);
		}
		
		print();
		
	
		
		

	}

}
