
public class �迭_�󵵼���� {

	public static void main(String[] args) {
	// arr�迭 �� �ߺ��ȼ��ڰ� ����� �����  count�迭 ����
		int[] arr = new int[10];
		int[] count = new int[10];
		
	// arr�迭�� ���� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
	// arr�迭 ���
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=============���==============\n");
		
	// �ߺ� ���� ���
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
	// ��� ���
		for(int i = 0; i < arr.length; i++) {
			if(count[i] != 0)
			System.out.println(i + "�� ���� : " + count[i]);
		}
		
		for(int i : count) {
			System.out.println(i);
		}
	}

}
