package �ݺ���_����;

public class ����1 {

	public static void main(String[] args) {
		
// =====================================================================================
		// ����
		int sum = 0;
		int count = 0;
		
		// �ݺ���
		for(int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				count += 1;
				sum = sum + i;
			}
		}
		
		// ���
		System.out.println("7�� ��� ���� : " + count);
		System.out.println("7�� ��� �� : " + sum);

// =====================================================================================
		
		// ����
		int sum2 = 0;
		int count2 = 0;
		int i = 100;
		
		// �ݺ���
		while(i <= 999) {
			if(i % 7 == 0) {
				sum2 = sum2 + i;
				count2 += 1;
			}
			i++;
		}
		
		// ���
		System.out.println("7�� ��� ���� : " + count2);
		System.out.println("7�� ��� �� : " + sum2);
	}

}
