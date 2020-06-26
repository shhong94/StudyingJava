package 반복문_문제;

public class 문제2 {

	public static void main(String[] args) {
		// 변수 
		int sum1 = 0;
		int count1 = 0;
		
		// 반복문
		for(int i = 100; i <= 999; i++) {
			if(i % 4 != 0) {
				sum1 = sum1 + i;
				count1 = count1 + 1;
			}
		}
		
		// 출력
		System.out.println("4의 배수가 아닌 수의 갯수 : " + count1);
		System.out.println("4의 배수가 아닌 수의 합 : " + sum1);
	
// ==========================================================================
		
		
		// 변수
		int sum2 = 0;
		int count2 =0;
		int i = 100;
		
		// 반복문
		while(i <= 999) {
			if(i % 4 != 0) {
				sum2 = sum2 + i;
				count2 = count2 + 1;
			}			
			i++;
		}
		
		// 출력
		System.out.println("4의 배수가 아닌 수의 갯수 : " + count2);
		System.out.println("4의 배수가 아닌 수의 합 : " + sum2);
		
	}

}
