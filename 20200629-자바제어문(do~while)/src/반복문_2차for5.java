
public class �ݺ���_2��for5 {

	public static void main(String[] args) {
		System.out.println("��");
		for(int a = 1; a <= 5; a++) {			// �� ��
			for(int b = 1; b <= a; b++) {		// a���
				System.out.print(a);
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		System.out.println("��");
		
		for(int a = 1; a <= 5; a++) {			
			for(int b = 1; b <= a; b++) {		
				System.out.print(b);
			}
			System.out.println();
		}

		System.out.println("=========================================");
		System.out.println("��");
		
		for(int a = 1; a <= 5; a++) {			
			for(int b = 1; b <= 6-a; b++) {		
				System.out.print(a);
			}
			System.out.println();
		}
		
	}

}
