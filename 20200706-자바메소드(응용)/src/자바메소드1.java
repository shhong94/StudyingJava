/*
 * 	5���� ���� �Է�
 * 	5�� ������ ���������Ͽ� ����
 * 	
 */
public class �ڹٸ޼ҵ�1 {
	
	// �������� �޼ҵ�
	static int[] sort(int[] arr, String type) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				
				// ��������
				if(type.equals("ASC")) {
					if(arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
				
				// ��������
				if(type.equals("DESC")) {
					if(arr[i] < arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}	
			}
		}
		
		return arr;
	}
	
	
	
// ============================================================================ ����
	public static void main(String[] args) {
		// �迭 ����
		int[] arr = {10, 40, 30, 50, 20};
		System.out.print("���� �� : ");
		// ���� �� ���
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		// ���� �� ���
		System.out.print("\n���� �� : ");
		int[] result = sort(arr, "DESC");	// �Ű����� 2�� ����ֱ�
		for(int i : result) {
			System.out.print(i + " ");
		}
	}

}

/*
 *	1. ���� �迭 ����, ������ �� �迭 ����
 *	2. ����� �Է°� ���� ����
 *	3. �Է°� �ޱ�
 *	4. while�� ����
 *		���� üũ
 *		�ߺ� üũ
 *		�Է°��� �Ѱ��� �и��Ͽ� �迭�� ����
 *		��(�����迭 �� �� �迭 �ϳ��� ��)
 *		���� s�� b �ʱ�ȭ�ϰ� ���ǹ� ����
 *		���
 * 
*/