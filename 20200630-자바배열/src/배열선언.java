/*
 * 	�� �迭
 * 		1. ���� Ÿ���� ���� �������� ��� ����
 * 		2. ���� Ÿ���� ������ ���� ����(double Ÿ���� �迭 �ȿ� int ���� ����)
 * 		3. �� ���� �������� �̿��Ͽ� ���� ������ ����
 * 		4. �޸� �ּ�(�ε��� ��ȣ)�� �̿��Ͽ� �����ϴ� ����(��������)
 * 		5. �ʱ�ȭ ���
 * 			�� �޸𸮰����� �̸� ����� ���� ���߿� ä���
 * 				String[] title = new String[10];
 * 			�� ���� ���� ����
 * 				int[] score = {90, 80, 85, 70, 60};
 * 
 */		
public class �迭���� {

	public static void main(String[] args) {
		// 5�� ���� ������ ����
		// ������ ��յ� ���ϱ�
		
		int[] score = {80, 90, 75, 90, 85};
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i <score.length; i++) {
			total = total + score[i];
		}
		avg = total / 5.0;
		
		System.out.println(total);
		System.out.println(avg);
	}

}
