
public class ��øfor������_����_�Ųٷ� {

	public static void main(String[] args) {
		for(int a = 1; a <= 5; a++) {
			for(int b = 5; b >= 6-a; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 5; b >= a; b--) {
				System.out.print(b);
			}
			System.out.println();
			
		}
		
		
//=======================================================
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5-a; b++) {
				System.out.print(" ");
			}
			for(int c = 5; c >= 6-a; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a-1; b++) {
				System.out.print(" ");
			}
			for(int c = 5; c >= a; c--) {
				System.out.print(c);
			}
			System.out.println();
		}


	}

}
