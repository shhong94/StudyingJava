package �ݺ���_����;

public class ����3 {

	public static void main(String[] args) {
		// ����
		int sum1 = 0;
		int sum2 = 0;
		
		// �ݺ���
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
			else {
				sum1 = sum1 + i;
			}
		}
		
		// ���
		System.out.println("¦���� : " + sum2);
		System.out.println("Ȧ���� : " + sum1);

		
// ====================================================================
		
		// ����
		int sum3 = 0;
		int sum4 = 0;
		int i = 1;
		
		// �ݺ���
		while(i <= 30) {
			if(i % 2 == 0) {
				sum4 = sum4 + i;
			}
			else {
				sum3 = sum3 + i;
			}
			i++;
		}
		
		// ���
		System.out.println("¦���� : " + sum4);
		System.out.println("Ȧ���� : " + sum3);
	}

}
