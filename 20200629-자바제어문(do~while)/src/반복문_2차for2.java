/*
 * 	**********
 * 	**********
 * 	**********
 * 	**********
 * 	**********
 * 
 * 
 * 	1
 * 	12
 * 	123
 * 	1234
 * 	12345
 */
public class 반복문_2차for2 {

	public static void main(String[] args) {
		
		System.out.println("===================================================");
/*
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}

		System.out.println("===================================================");
/*
 * aaaaa
 * bbbbb
 * ccccc
 * ddddd
 * eeeee
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.printf("%c", a + 96);
			}
			System.out.println();
		}
		
		System.out.println("===================================================");
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("===================================================");
/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
		for(int a = 5; a >= 1; a--) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("===================================================");
/*
 * 5
 * 54
 * 543
 * 5432
 * 54321
 */
		for(int a = 5; a >= 1; a--) {
			for(int b = 5; b >= a; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("===================================================");
/* 54321
 * 5432
 * 543
 * 54
 * 5
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 5; b >= a; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
