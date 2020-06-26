package 반복문_문제;

public class 문제3 {

	public static void main(String[] args) {
		// 변수
		int sum1 = 0;
		int sum2 = 0;
		
		// 반복문
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
			else {
				sum1 = sum1 + i;
			}
		}
		
		// 출력
		System.out.println("짝수합 : " + sum2);
		System.out.println("홀수합 : " + sum1);

		
// ====================================================================
		
		// 변수
		int sum3 = 0;
		int sum4 = 0;
		int i = 1;
		
		// 반복문
		while(i <= 30) {
			if(i % 2 == 0) {
				sum4 = sum4 + i;
			}
			else {
				sum3 = sum3 + i;
			}
			i++;
		}
		
		// 출력
		System.out.println("짝수합 : " + sum4);
		System.out.println("홀수합 : " + sum3);
	}

}
