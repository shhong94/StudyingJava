/*
 *  �� ���� : �����ؼ� ��밡���� �޸� ��� ���� (���α׷� ���� �� �ڵ����� �޸𸮿��� �����)
 *  �� ��� : ������ �� ���� ��
 *  
 *  �� ������ ����
 *  	1. ����
 *  		�Ѱ��� �����͸� �����ϴ� ����
 *  	2. �迭
 *  		���� Ÿ�� ���� �� ����
 *  	3. Ŭ����
 *  		�ٸ� Ÿ�� ���� �� ����
 *  		�� �������� Ŭ���� : �����θ� ���(����� ���� ��������)
 *  		�� �׼� Ŭ���� : ��ɸ� ����
 *  
 *  �� ���� ���̴� ��������
 *  	1. ����(int, long)
 *  	2. �Ǽ�(double)
 *  	3. �Ҹ�(boolean)
 *  	4. ���ڿ�(String)
 */
public class �������� {

	public static void main(String[] args) {
		// ������ ������ �迭
		int[] com = new int[10];
		
		// ������ ����
		int random = 0;
		
		// �ߺ� ������ ����, �ߺ��Ǹ� ������ �ٽ� �߻�
		boolean check = false;
		for(int i = 0; i < 10; i++) {
			//�ߺ� ���� Ȯ��
			check = true;
			while(check) {
				// ���� �߻�
				random = (int)(Math.random()*10)+1;
				// ���� Ȯ��
				check = false;
				// ���� ���� ����Ǿ����� ��
				for(int j = 0; j < i; j++) {
					if(com[j] == random) {
						check = true;
						break;
					}
				}
			}
			// while���� ����� com �迭�� ���� ����
			com[i] = random;	
		}
		for(int i : com) {
			System.out.print(i + " ");
		}
		
		

	}

}
