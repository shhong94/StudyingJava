/*
 * 	1. 단일 조건문은 여러개를 사용해도 
 * 		처음부터 마지막까지 수행된다. 
 * 
 * 	2. {}을 생략할 때는 수행문장이 1개일 경우이다.
 */
public class 자바단일조건문2 {

	public static void main(String[] args) {
		int a = 15;
		// 3의 배수, 5의 배수, 7의 배수
		// 단일조건문 여러개 (각 문장이 별개의 문장)
		if (a % 3 == 0)
			System.out.println(a + "는 3의 배수입니다.");
		if (a % 5 == 0)
			System.out.println(a + "는 5의 배수입니다.");
		if (a % 7 == 0)
			System.out.println(a + "는 7의 배수입니다.");
		
		// 다중조건문 (전체가 한 개의 문장)
		if (a % 3 == 0)
			System.out.println(a + "는 3의 배수입니다!");
		else if (a % 5 == 0)
			System.out.println(a + "는 5의 배수입니다!");
		else if (a % 7 == 0)
			System.out.println(a + "는 7의 배수입니다!");
	}

}
