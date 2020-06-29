
public class �ݺ���_2��for3 {

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
 *  �� (a)	���ĺ�(b)   => a = b
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
			for(int b = 1; b <= 6 - a; b++) {   // <============ b = 6-a �������� Ȱ��
				System.out.printf("%c", b + 64);
			}
			System.out.println();
		}
/*
 *  �� (a)	���ĺ�(b)   => a + b = 6
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
				if(a == b) {				// a�� b�� ������ ���� ���
					System.out.print(b);
				}
				else {						// a�� b�� �ٸ� �� # ���
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
// 25���� 1���� �����ϴ� ���� c�� ��� 1�� ���ҽ�Ű��
// ���� ����� ���� c
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
 * �ټ�(a) ����(b) ��(c)
 * 1      0      5
 * 2	  1		 4
 * 3      2      3
 * 4      3      2
 * 5      4      1
 * 
 * a�� b�� ����       b + 1 = a   ==> b = a - 1
 * a�� c�� ����	   a + c = 6   ==> c = 6 - a
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
