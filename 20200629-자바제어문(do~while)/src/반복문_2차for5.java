
public class 반복문_2차for5 {

	public static void main(String[] args) {
		System.out.println("①");
		for(int a = 1; a <= 5; a++) {			// 줄 수
			for(int b = 1; b <= a; b++) {		// a출력
				System.out.print(a);
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		System.out.println("②");
		
		for(int a = 1; a <= 5; a++) {			
			for(int b = 1; b <= a; b++) {		
				System.out.print(b);
			}
			System.out.println();
		}

		System.out.println("=========================================");
		System.out.println("③");
		
		for(int a = 1; a <= 5; a++) {			
			for(int b = 1; b <= 6-a; b++) {		
				System.out.print(a);
			}
			System.out.println();
		}
		
	}

}
