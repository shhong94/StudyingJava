
public class �ݺ���_for6 {

	public static void main(String[] args) {
		
		// A~Z���� ���		
		char i;
		for(i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		
		int a;
		for(a = 10; a >= 1; a--) {
			System.out.println(a);
		}
		System.out.println("\n===========================================\n");
		
		for(int b = 1, c = 10; b <= 10; b++, c--) {
			System.out.println("b = " + b + ", c = " + c);
		}
	}

}
