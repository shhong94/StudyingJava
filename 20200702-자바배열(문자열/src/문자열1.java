/*
 * 	
 */
public class ���ڿ�1 {

	public static void main(String[] args) {
		// ���� 5�� �����Ͽ� ����� ���ϱ�
		int[] arr = new int[5];
		int total = 0;
		
		// ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		// ���
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		// ���
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println();
		System.out.println();
	}

}
