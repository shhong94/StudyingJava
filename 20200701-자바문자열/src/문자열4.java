/*
 *  startsWith 시작하는 문자열이 같을 때
 *  endsWith 끝나는 문자열이 같을 때
 */

import java.util.*;
public class 문자열4 {

	public static void main(String[] args) throws Exception{
		String[] data = {
			"Java Program",
			"Oracle Program",
			"JSP Program",
			"Oracle AND Java",
			"Java AND JSP",
			"Ajax Program",
			"Spring AND Mobile",
			"Kotlin Program",
			"XML AND Annotation",
			"Java AND JQuery"
		};
		// startsWith
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 :");
		String ss = scan.nextLine();			// next() 엔터, 스페이스바
												// nextLine() 엔터
		
		
		for(String s : data) {
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);
				Thread.sleep(500);
			}
		}
	}

}
