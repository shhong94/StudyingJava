package 반복문_문제;

public class 문제1 {

	public static void main(String[] args) {
		
// =====================================================================================
		// 변수
		int sum = 0;
		int count = 0;
		
		// 반복문
		for(int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				count += 1;
				sum = sum + i;
			}
		}
		
		// 출력
		System.out.println("7의 배수 갯수 : " + count);
		System.out.println("7의 배수 합 : " + sum);

// =====================================================================================
		
		// 변수
		int sum2 = 0;
		int count2 = 0;
		int i = 100;
		
		// 반복문
		while(i <= 999) {
			if(i % 7 == 0) {
				sum2 = sum2 + i;
				count2 += 1;
			}
			i++;
		}
		
		// 출력
		System.out.println("7의 배수 갯수 : " + count2);
		System.out.println("7의 배수 합 : " + sum2);
	}

}
