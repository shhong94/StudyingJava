/*
 *  �ڹٿ��� ����ϴ� �������� => �޸��� ũ�� ����
 *  ==================================
 *  	��ǻ�ʹ� 0, 1 => bit
 *  
 *  ����
 *   - byte => -128 ~ +127 (���� �б�/����/���ε�/�ٿ�ε�, ��Ʈ��ũ ����)
 *   - short => -32768 ~ +32767 (C���� ȣȯ�� ���� ����, ���� ��)
 *   - int => -21��4õ ~ +21��4õ (������ ��ǻ�Ϳ��� �⺻������ int�� �ν�, �ɰ��ų� ��ġ�� �ʾƵ� �Ǿ� �ӵ� ��)
 *   - long => (������, ������, �ֽ� ��)
 *   
 *  �Ǽ�
 *   - float => �Ҽ��� 6�ڸ� 4byte
 *   - double => �Ҽ��� 15�ڸ� 8byte (�Ǽ��� ��ǻ�Ϳ��� �⺻������ double�� �ν�)
 *   �� ����(�������) = (÷���� ��)
 *     �ؼ�) ÷���� ���� ��������� ����־��. ���� "�������"�� "÷���� ��"���� ���ų� Ŀ�� ��.
 *     ex) double = float
 *  
 *  ����
 *   - char 2byte => 0 ~ 65535 ���� ���� �����.
 *     * A = 65
 *       a = 97
 *       0 = 49
 *       
 *  ��
 *   - true/false ���� (1byte) => boolean
 *   
 *  �޸𸮿� �����ϴ� ũ��
 *   byte < short < int < long < float < double
 *          char
 *   
 */


public class �ڹٵ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 80;
		int eng = 80;
		int math = 80;
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("�������� : " + kor + "��");
		System.out.println("�������� : " + eng + "��");
		System.out.println("�������� : " + math + "��");
		System.out.println("���� : " + total + "��");
		System.out.println("��� : " + avg);
		if (avg >= 80) {
			char score = 'B';
			System.out.println(score);
		}
	}

}
