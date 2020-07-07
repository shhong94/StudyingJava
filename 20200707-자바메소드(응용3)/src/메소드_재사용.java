import java.util.*;
public class 메소드_재사용 {

	public static void main(String[] args) {
		int year = 달력만들기_메소드사용.userInput("년도");
		boolean check = 달력만들기_메소드사용.isYear(year);
		if(check == true) {
			System.out.println("윤년이다");
		}
		else {
			System.out.println("윤년이 아니다");
		}
	}

}
