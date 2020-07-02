/*
 *  ◆ substring
 *  	1. substring(int start)
 *  			(int start)인덱스부터 마지막 인덱스까지 출력
 *  	2. substring(int start, ine end)		 ★★★★★★★★★★★★★★★★★★★★★
 *  			(int start)인덱스부터 (int end)인덱스의 ★★★★★앞 인덱스까지★★★★★ 출력
 *  											   ★★★★★★★★★★★★★★★★★★★★
 */
public class 문자열3 {

	public static void main(String[] args) {
		String msg = "100-010";
		System.out.println(msg.substring(0, 3));
		System.out.println(msg.substring(4));

	}

}
