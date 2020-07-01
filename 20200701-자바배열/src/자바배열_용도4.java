/*
 *  byte[] b => ���� ����
 *  String[] s => ���ڿ��� ���� ���
 *  int[] i => �������, ��� ��
 *  double[] d => ���, �󵵼� ��
 */
/*
 * 	���� ���� Ȯ��
 * 	a.length()
 * 
 * 	���ڿ� ������ ���� 1�� ����
 * 	a.charAt(0)
 */

public class �ڹٹ迭_�뵵4 {

	public static void main(String[] args) {
		String[] s = {
			"apple",
			"strawBerry",
			"grape",
			"pear",
			"cherry",
			"banana",
			"melon"
		};
		
		// ���ϸ� �߿� ���� �� ����
		// ��ü ���� ���
		System.out.println("=========== ��ü ���ϸ� ===========");
		for(String i : s) { // �ε����� �������� ����
			System.out.println(i);
		}
		System.out.println("================================");
		System.out.println("���ϸ��� ���� �� ������?");
		// ���ϸ��� ���� �� ���� ���
		int max = 0;
		for(String i : s) {
			int len = i.length();
			if(max < len) {
				max = len;
			}
		}
		// ���
		for(String i : s) {
			if(i.length() == max) {
				System.out.println(i);
			}
		}
		
		System.out.println("================================");
		System.out.println("���ϸ��� ���� ª�� ������?");
		
		// ���ϸ��� ���� ª�� ���� ���
				int min = 100;
				for(String i : s) {
					int len = i.length();
					if(min > len) {
						min = len;
					}
				}
				// ���
				for(String i : s) {
					if(i.length() == min) {
						System.out.println(i);
					}
				}

		System.out.println("==================================");
		String msg = "Hello Java";
		System.out.println(msg);
		System.out.print("5��° ���� : ");
		for(int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
		
	}

}
