
public class 반복문_2차for3 {

	public static void main(String[] args) {
/*
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.printf("%c", b + 64);
			}
			System.out.println();
		}
		
/*
 *  줄 (a)	알파벳(b)   => a = b
 *   1		 1
 *   2		 2
 *   3		 3
 *   4		 4
 *   5		 5
 */
		
		System.out.println("========================================================");
		
/*
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 */
		for(int a = 5; a >= 1; a--) {
			for(int b = 1; b <= a; b++) {
				System.out.printf("%c", b + 64);
			}
			System.out.println();
		}
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 6 - a; b++) {   // <============ b = 6-a 수열공식 활용
				System.out.printf("%c", b + 64);
			}
			System.out.println();
		}
/*
 *  줄 (a)	알파벳(b)   => a + b = 6
 *   1		 5				=> b = 6 - a
 *   2		 4
 *   3		 3
 *   4		 2
 *   5		 1
 */		
		
		System.out.println("========================================================");
		
/*
 * 1####
 * #2###
 * ##3##
 * ###4#
 * ####5
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				if(a == b) {				// a와 b가 같으면 숫자 출력
					System.out.print(b);
				}
				else {						// a와 b가 다를 땐 # 출력
					System.out.print('#');
				}
			}
			System.out.println();
		}
		
		
		System.out.println("========================================================");
		
/*
 * 25 24 23 22 21
 * 20 19 18 17 16
 * 15 14 13 12 11
 * 10 9  8  7  6
 * 5  4  3  2  1
 */
// 25부터 1까지 감소하는 변수 c를 잡고 1씩 감소시키기
// 실제 출력은 변수 c
		int c = 25;
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				System.out.printf("%d\t", c);
				c--;
			}
			System.out.println();
		}
		
		System.out.println("========================================================");
		
/*
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a - 1; b++) {
				System.out.print(" ");
			}
			for(c = 1; c <= 6 - a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*
 * 줄수(a) 공백(b) 별(c)
 * 1      0      5
 * 2	  1		 4
 * 3      2      3
 * 4      3      2
 * 5      4      1
 * 
 * a와 b의 관계       b + 1 = a   ==> b = a - 1
 * a와 c의 관계	   a + c = 6   ==> c = 6 - a
 */
		
		System.out.println("========================================================");
		
/*
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5-a; b++) {
				System.out.print(" ");
			}
			for(c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
