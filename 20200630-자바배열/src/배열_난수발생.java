
public class �迭_�����߻� {

	public static void main(String[] args) {
		// �ζ� ��ȣ�� �����ϴ� ����
		
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
		}
		
		for(int i : lotto) {
			System.out.print(i + " ");
		}

	}

}
