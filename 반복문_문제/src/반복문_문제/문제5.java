package �ݺ���_����;

public class ����5 {

	public static void main(String[] args) {
		// ����
		int multiple7 = 0;
		int multiple9 = 0;
		
		// �ݺ���
		for(int i = 1; i <= 1000; i++) {
			if(i % 7 == 0) {
				multiple7 += i;
			}
			if(i % 9 == 0) {
				multiple9 += i;
			}
		}
		
		// ���
		System.out.println("7�� ��� : " + multiple7);
		System.out.println("9�� ��� : " + multiple9);
		System.out.println("7�� ��� + 9�� ��� : " + (multiple7 + multiple9));
		
		
// ===============================================================================
		
		
		// ����
		int multiple77 = 0;
		int multiple99 = 0;
		int i = 1;
		
		// �ݺ���
		while(i <= 1000) {
			if(i % 7 == 0) {
				multiple77 += i;
			}
			if(i % 9 == 0) {
				multiple99 += i;
			}
			i++;
		}
		System.out.println("7�� ��� : " + multiple77);
		System.out.println("9�� ��� : " + multiple99);
		System.out.println("7�� ��� + 9�� ��� : " + (multiple77 + multiple99));
		
		
	}

}
