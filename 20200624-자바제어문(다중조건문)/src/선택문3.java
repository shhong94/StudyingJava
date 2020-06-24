/*
 * 	3개의 정수를 입력받아서 학점 계산
 */
import java.util.*;
public class 선택문3 {

	public static void main(String[] args) {
	// 변수
		int kor = 0, eng = 0, math = 0;
		char score = 'A';
	// 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 3개를 입력하세요 : ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
	// 데이터 가공
		switch((kor + eng + math) / 30) {
		case 10:
		case 9:
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
		default:
			score = 'F';
			break;
		}
		System.out.println("=========결과=========");
		System.out.println("평균 : " + (kor + eng + math) / 3.0f);
		System.out.println("학점 : " + score);
	}

}
