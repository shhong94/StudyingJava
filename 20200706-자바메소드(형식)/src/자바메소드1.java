/*
 * 	�� �޼ҵ�
 * 		1. �ڵ����� �޸𸮿� ���� (static)				<============== ���� �޼ҵ�
 * 		2. ���α׷��Ӱ� �޸𸮸� �Ҵ��ϰ� ���� (new������)	<==============	�ν��Ͻ� �޼ҵ�
 * 		3. �޼ҵ��� ����θ� ���						<==============	�߻� �޼ҵ�
 * 
 * 	�� �޼ҵ��� ����
 * 		1. ����� (�޸𸮿� ���� �� ��)
 * 		2. ������ (�޸𸮿� ���� ��)
 * 
 * 	�� �޼ҵ��� Ư¡
 * 		1. ���ϰ��� �������� ��� �迭 �Ǵ� Ŭ������ ���� ����
 * 		2. �Ű������� 3�� �ʰ��� �������� ����
 * 				( ex = 10���� ���������� ����� ���ϴ� �޼ҵ� �ۼ� ��, 10���� �Ű������� �ƴ϶� �迭�� ��� �Ű������� ��� ����)
 * 		3. return ������� ���� ��쿡�� ���� ����(main �޼ҵ�...)
 * 
 * 	�� ���ǻ���
 * 		1. ������� ���� Ÿ������?
 * 		2. ����ڷκ��� � ���� �޾ƾ�?
 */

// ����ڷκ��� ���� 1�� �Է¹ް�
// �ش� �������� ���
// ����� O, �Ű����� O => �������� ��� �Ѱ���
// �����  X, �Ű�����  O => �޼ҵ� �ȿ��� ���
import java.util.*;
public class �ڹٸ޼ҵ�1 {
	
	
	// ����� O, �Ű����� O
	static String multiTable1 (int num) {
 		String multi1 = "";
		for(int i = 1; i <= 9; i++) {
			multi1 += num + " * " + i + " = " + (num * i) + "\n";
		}
		
		return multi1;			// �޼ҵ� multiTable1�� ������� �޴� ������ ����Ŭ������ �־�� ����� ����
								/*
								 *	Stirng ���� = multiTable1(num);
								 *	System.out.println(����);
								 * 	
								 */
	}
	
	
	
// �����  X, �Ű�����  O
	static void multiTable2 (int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int num = scan.nextInt();
//		
//		String multi1 = multiTable1(num);
//		System.out.println(multi1);
		for(int i = 2; i <= 9; i++) {
			String a = multiTable1(i);
			System.out.println(a);
		}
		
		
		
		

	}

}
