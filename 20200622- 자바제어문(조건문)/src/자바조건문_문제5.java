/*
 * 	char ���� �����ϰ� ���Ƿ� ���ĺ� ����
 * 	char ������ �빮�ڸ� �ҹ��ڷ�, �빮�ڸ� �ҹ��ڷ� ���
 * 
 * 	�� ��� ��������
 * 		�� ������ (��, ��, ����)
 * 		�� �ܵ�ó�� (���, ����, ����)
 * 		�� ����ȯ (��������ȯ)
 */
public class �ڹ����ǹ�_����5 {

	public static void main(String[] args) {
		char alpha = 'A';
		
		if (alpha >= 'a' && alpha <= 'z')
		{
			System.out.println((char)(alpha - 32));
		}
		if (alpha >= 'A' && alpha <= 'Z')
		{
			System.out.println((char)(alpha + 32));
		}
	}

}
