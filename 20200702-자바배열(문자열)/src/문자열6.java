/*
 *  �� valueOf()
 *  	��� ���������� ���ڿ��� ��ȯ
 *  
 *  ex) char[] c = {'a', 'b', 'c', 'd'};
 *  	valueOf(c) => "abcd"
 *  
 *  
 *  �� toCharArray()
 *  	StringŸ���� char Ÿ������ ��ȯ
 */
public class ���ڿ�6 {

	public static void main(String[] args) {
		char[] c = {'H', 'e', 'l', 'l', 'o'};
	// valueOf�� static �Լ��̱� ������ String.�� �տ� ����
		String msg = String.valueOf(c);
		System.out.println(msg);
		
		String ss = "Hello Java!";
		char[] cc = ss.toCharArray();

		
		int a = 10;
		int b = 20;
		System.out.println(String.valueOf(a) + String.valueOf(b));
	}

}
