/*
 * AaBbCc......
 */
public class 반복문_for {

	public static void main(String[] args) {
		// AaBbCc......
		char c = 'a';
		for(char ch = 'A'; ch <='Z'; ch++) {
			System.out.print(ch + "" + c++);
		}
		System.out.println();
		System.out.println();
		
		// 조건문 없이 1~10까지 홀수만 출력
		// 일정간격
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println();
		
		// 조건문 없이 1~10까지 짝수만 출력
		// 일정간격
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println();
		
		// 1~5 까지 콤마 포함해서 출력(5다음은 콤마 X)  =>  1,2,3,4,5
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
			if(i < 5) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println();
		
		// 이진법
		// 10 => 1010,   11 => 1111
		int su = 10;
		for(;;) {
			int a = su % 2;
			System.out.print(a);
			su = su / 2;
			if(su == 0) {
				break;
			}
			
		}
	}

}
