/*
 * 	◆ 반복문 - for, while, do~while
 * 		1. for : 반복 횟수가 있을 때 주로 사용
 * 		2. while : 반복 횟수가 없을 때 주로 사용
 * 		3. do~while : 조건을 나중에 검색. 한번 이상은 반드시 수행.
 * 
 * 	◆ for
 * 		1. 형식
 * 			for(int a = 1; a <= 10; a++) {
 * 				반복 수행 문장 (a가 1부터 10이 될 때까지 수행. 즉, 10번 수행)
 * 			}
 * 		2. 실행 순서
 * 			for(초기값; 조건식; 증감식) {
 * 				반복 수행 문장
 * 			}
 * 			① 초기값 => ② 조건식 => ③ 반복수행문장 => ④ 증감식
 * 					 |============================|	
 * 							조건식이 false일 때까지 반복
 * 		3. 특징
 * 			> 조건식은 반드시 한개만.
 * 			> 초기값 및 증감식 내의 변수는 여러개 사용 가능
 */			 
public class 반복문_for {

	public static void main(String[] args) {
		// 1~10을 출력
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
