// ������ ����, ����, ����
public class MainClass2 {
	// ��������
	int a = 10;
	int b = 20;
	
	// ������
	MainClass2() {
		a = 100;
		b = 200;
	}
	
	// �ʱⰪ�� �ٸ��� �Է��ϸ鼭 �ν��Ͻ��� �����ϴ� ���
	MainClass2(int c, int d){	// �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
		a = c;
		b = d;
	}
	public static void main(String[] args) {
		MainClass2 m = new MainClass2();
		System.out.println(m.a);
		System.out.println(m.b);
		
		MainClass2 m1 = new MainClass2(1000, 2000);		// �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
		System.out.println(m1.a);
		System.out.println(m1.b);
	}

}
