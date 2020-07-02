import java.util.*;
public class 문자열2_연습문제 {

	public static void main(String[] args) {		
		// 배열
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		// 입력받은 과목
		String input;
		
		
		while(true) {
			// 불린값을 while문 맨위에 두어야 루프가 돌아갈 때마다 false로 초기화됨.
			// while문 바깥에 두게 되면 if (bCheck == false) 조건문이 수행되지 않을 수도 있음.
			boolean bCheck = false;
			
			// 과목 이름 입력받기
			Scanner scan = new Scanner(System.in);
			System.out.print("과목 이름을 입력하세요 : ");
			input = scan.nextLine();
			
			if(input.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			for(int i = 0; i < course.length; i++) {
				if(course[i].contains(input)) {
					bCheck = true;
					System.out.println("과목 이름 : " + course[i]);
					System.out.printf("%s의 점수는 %d", course[i], score[i]);
					System.out.println();
				}
				// 없는과목일 경우의 조건문을 for문 안에 넣게 되면 해당 문장이 course.length 만큼 출력됨
				// for문은 루프를 돌리기 때문에.
	//			else if (bCheck == false) {
	//				System.out.println("없는 과목입니다");
	//			}
			}
			// 이렇게 for문 바깥으로 빼야 문장이 한번만 출력됨
			if (bCheck == false) {
				System.out.println("없는 과목입니다");
			}
		}
		
	}

}
