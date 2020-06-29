/*
 * 	**********
 * 	**********
 * 	**********
 * 	**********
 * 	**********
 */
public class 반복문_2차for2 {

	public static void main(String[] args) {
		
		System.out.println("===================================================");
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}

		System.out.println("===================================================");
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.printf("%c", a + 96);
			}
			System.out.println();
		}
	}

}
