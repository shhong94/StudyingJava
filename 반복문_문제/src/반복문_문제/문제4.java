package �ݺ���_����;

public class ����4 {

	public static void main(String[] args) {
		// ����
		
		// �ݺ���
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		
// =============================================================
		
		// ����
		int i = 1;
		
		// �ݺ���
		while(i <= 100) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + "\t");
			}
			i++;
		}
	}

}
