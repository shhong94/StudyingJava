/*
 * 	문자열 비교 : equals()
 *	대소문자구분없이 문자열비교 : equalsIgnoreCase()
 *
 * 	문자찾기 : contains()
 * 	시작문자열 : startsWith()
 * 	끝나는문자열 : endsWith()
 * 	문자열 자르기 : substring()
 * 	공백문자제거 : trim()
 * 	문자위치찾기 : indexOf(), lastIndexOf()
 * 	형변환 : valueOf()
 * 	
 */

// 로그인 처리(문자열 비교 equals(), equalsIgnoreCase())
import java.util.*;
public class 문자열1 {

	public static void main(String[] args) {
		// ID, PW
		final String ID = "admin";
		final String PW = "1234";
		
		// 아이디 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력 : ");
		String id = scan.nextLine();
		
		// 비밀번호 입력
		System.out.print("패스워드를 입력 : ");
		String pw = scan.nextLine();
		
		// 결과
		if(id.equalsIgnoreCase(ID) && pw.equals(PW)) {
			System.out.println("로그인 되었습니다");
		}
		else {
			System.out.println("아이디 혹은 패스워드가 틀립니다");
		}
/*
 *  String끼리 ==을 사용하여 비교하면 주소 내의 값이 아니라 주소만을 비교함(값이 같더라도 주소는 각 String마다 다 다름)
 */

	}

}
