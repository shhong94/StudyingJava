
public class �迭_�������� {

	public static void main(String[] args) {
		// �迭 ����
		int[] arr = {3, 2, 4, 5, 1};
/*	i
 * 		
 */
		// ���� �� ���
		System.out.println("���� ��");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n���� ��");
		
		// ��������
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		// ���� �� ���
		for(int i : arr) {
			System.out.print(i + " ");
		}
		

	}

}
