/*
 * 	사용자가 년도를 입력 후 윤년 여부 확인
 * 	조건
 * 		1. 4년마다 윤년
 * 		2. 100년마다 제외
 * 		3. 400년마다 윤년
 */
import java.util.*;
public class 자바선택조건문2 {

	public static void main(String[] args) {
		int year = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		
		// 윤년 여부 확인
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //윤년이라면
			System.out.println(year + "는(은) 윤년입니다.");
			
		else //윤년이 아니라면
			System.out.println(year + "는(은) 윤년이 아닙니다.");
	}

}
