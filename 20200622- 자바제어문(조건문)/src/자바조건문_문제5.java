/*
 * 	char 변수 선언하고 임의로 알파벳 대입
 * 	char 변수가 대문자면 소문자로, 대문자면 소문자로 출력
 * 
 * 	◆ 제어문 중점사항
 * 		① 연산자 (비교, 논리, 부정)
 * 		② 단독처리 (산술, 증감, 대입)
 * 		③ 형변환 (강제형변환)
 */
public class 자바조건문_문제5 {

	public static void main(String[] args) {
		char alpha = 'A';
		
		if (alpha >= 'a' && alpha <= 'z')
		{
			System.out.println((char)(alpha - 32));
		}
		if (alpha >= 'A' && alpha <= 'Z')
		{
			System.out.println((char)(alpha + 32));
		}
	}

}
