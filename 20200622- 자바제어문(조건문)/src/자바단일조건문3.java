// 조건문 제작하는 방법

/*
 *  조건문의 결과는 불린값으로.
 *  
 */
public class 자바단일조건문3 {

	public static void main(String[] args) {
//		int a = 10;
//		
//		System.out.println("1");
//		System.out.println("2");
//		
//		//a가 짝수일 때만 출력
//		if (a % 2 == 0)
//			System.out.println("3");
//		
//		System.out.println("4");
//		System.out.println("5");
		
		// 알파벳을 저장하고 대문자 / 소문자인지 출력
		char alpha = '갖';
		if (alpha >= 'A' && alpha <= 'Z')
			System.out.println(alpha + "는(은) 대문자입니다.");
		
		if (alpha >= 'a' && alpha <= 'z')
			System.out.println(alpha + "는(은) 소문자입니다.");
	
		if (alpha >= '0' && alpha <= '9')
			System.out.println(alpha + "는(은) 숫자입니다.");
		
		if (alpha >= '가' && alpha <= '힣')
			System.out.println(alpha + "는(은) 한글입니다.");
		
		if (alpha == '\t' || alpha == '\n')
			System.out.println(alpha + "는(은) 한글입니다.");
		
	}

}
