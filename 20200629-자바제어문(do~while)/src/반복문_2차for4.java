
public class 반복문_2차for4 {

	public static void main(String[] args) {
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.println();
			}
		}
		
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

	}

}
