/*
 *  ◆ valueOf()
 *  	모든 데이터형을 문자열로 변환
 *  
 *  ex) char[] c = {'a', 'b', 'c', 'd'};
 *  	valueOf(c) => "abcd"
 *  
 *  
 *  ◆ toCharArray()
 *  	String타입을 char 타입으로 변환
 */
public class 문자열6 {

	public static void main(String[] args) {
		char[] c = {'H', 'e', 'l', 'l', 'o'};
	// valueOf는 static 함수이기 때문에 String.이 앞에 붙음
		String msg = String.valueOf(c);
		System.out.println(msg);
		
		String ss = "Hello Java!";
		char[] cc = ss.toCharArray();

		
		int a = 10;
		int b = 20;
		System.out.println(String.valueOf(a) + String.valueOf(b));
	}

}
