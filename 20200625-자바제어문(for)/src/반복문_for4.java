/*
 *  1~100까지의 합
 */
public class 반복문_for4 {

	public static void main(String[] args) {
		// sum : 누적 변수
		int sum = 0;
		// i : 루프 변수
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.printf("1부터 %d까지의 합 : %d\n", i, sum);
		}
		
		
	}

}
