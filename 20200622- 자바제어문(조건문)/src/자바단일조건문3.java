// ���ǹ� �����ϴ� ���

/*
 *  ���ǹ��� ����� �Ҹ�������.
 *  
 */
public class �ڹٴ������ǹ�3 {

	public static void main(String[] args) {
//		int a = 10;
//		
//		System.out.println("1");
//		System.out.println("2");
//		
//		//a�� ¦���� ���� ���
//		if (a % 2 == 0)
//			System.out.println("3");
//		
//		System.out.println("4");
//		System.out.println("5");
		
		// ���ĺ��� �����ϰ� �빮�� / �ҹ������� ���
		char alpha = '��';
		if (alpha >= 'A' && alpha <= 'Z')
			System.out.println(alpha + "��(��) �빮���Դϴ�.");
		
		if (alpha >= 'a' && alpha <= 'z')
			System.out.println(alpha + "��(��) �ҹ����Դϴ�.");
	
		if (alpha >= '0' && alpha <= '9')
			System.out.println(alpha + "��(��) �����Դϴ�.");
		
		if (alpha >= '��' && alpha <= '�R')
			System.out.println(alpha + "��(��) �ѱ��Դϴ�.");
		
		if (alpha == '\t' || alpha == '\n')
			System.out.println(alpha + "��(��) �ѱ��Դϴ�.");
		
	}

}
