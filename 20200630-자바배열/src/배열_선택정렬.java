/*
 * 	�� DESC ��ħ����
 * 	�� ASC ��������
 * 
 * 	20 10 40 50 30
 * 
 * 	�� ��������
 * 		�� �տ� �ִ� ���� ���� ������ ���������� ���س����� ��� (�տ������� ������ ���糪��)
 * 	�� ��������
 * 		arr[0]�� arr[1], 1��2, 2��3, 3��4, 4��5 ������ �� (�ڿ������� ������ ���糪��)
 */
public class �迭_�������� {

	public static void main(String[] args) {
		// ���� ����
		int[] arr = {4, 8, 2, 10, 6};
		
		// ���� �� ���
		System.out.println("���� �� ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n���� ��");
		
		// ���� ���� ��������
		for(int i = 0; i < arr.length-1; i++) {			// i�� 0���� ����
			for(int j = i+1; j < arr.length; j++) {		// j�� i �ں��� ����(j=i+1)
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println();
			System.out.println("=================");
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}
		
		System.out.println();
		System.out.println("======= ���  =======");
		// ���� �� ���
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
