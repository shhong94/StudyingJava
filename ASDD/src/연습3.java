
public class ����3 {

	public static void main(String[] args) {
// ���� ������ �迭
		int[] arr = new int[10];
		

// i�� 0���� �迭ũ����� �ݺ��Ͽ� ���� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
	// j�� 0���� i���� �ݺ��Ͽ� �ߺ��Ǵ��� ��
			for(int j = 0; j < i; j++) {
		// arr�迭�� i�ε��� ���� j�ε������� ���� ��
				if(arr[i] == arr[j]) {
					arr[j] = (int)(Math.random()*10)+1;	// j�ε����� �ٽ� ���� ����
					i = 0;							// i�� 0���� �ʱ�ȭ�Ͽ� 1��° for�� ����
				}
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		System.out.print("�հ� : ");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
