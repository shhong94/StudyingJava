package �ݺ���_����;

public class ����2 {

	public static void main(String[] args) {
		// ���� 
		int sum1 = 0;
		int count1 = 0;
		
		// �ݺ���
		for(int i = 100; i <= 999; i++) {
			if(i % 4 != 0) {
				sum1 = sum1 + i;
				count1 = count1 + 1;
			}
		}
		
		// ���
		System.out.println("4�� ����� �ƴ� ���� ���� : " + count1);
		System.out.println("4�� ����� �ƴ� ���� �� : " + sum1);
	
// ==========================================================================
		
		
		// ����
		int sum2 = 0;
		int count2 =0;
		int i = 100;
		
		// �ݺ���
		while(i <= 999) {
			if(i % 4 != 0) {
				sum2 = sum2 + i;
				count2 = count2 + 1;
			}			
			i++;
		}
		
		// ���
		System.out.println("4�� ����� �ƴ� ���� ���� : " + count2);
		System.out.println("4�� ����� �ƴ� ���� �� : " + sum2);
		
	}

}
