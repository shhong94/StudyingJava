/*
 * AaBbCc......
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// AaBbCc......
		char c = 'a';
		for(char ch = 'A'; ch <='Z'; ch++) {
			System.out.print(ch + "" + c++);
		}
		System.out.println();
		System.out.println();
		
		// ���ǹ� ���� 1~10���� Ȧ���� ���
		// ��������
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println();
		
		// ���ǹ� ���� 1~10���� ¦���� ���
		// ��������
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println();
		
		// 1~5 ���� �޸� �����ؼ� ���(5������ �޸� X)  =>  1,2,3,4,5
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
			if(i < 5) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println();
		
		// ������
		// 10 => 1010,   11 => 1111
		int su = 10;
		for(;;) {
			int a = su % 2;
			System.out.print(a);
			su = su / 2;
			if(su == 0) {
				break;
			}
			
		}
	}

}
