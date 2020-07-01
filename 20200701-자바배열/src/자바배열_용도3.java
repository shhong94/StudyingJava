/*
 *  사용자가 정수 입력하면
 *  2진법으로 출력
 *  
 *  
 */
import java.util.*;
public class 자바배열_용도3 {

	public static void main(String[] args) {
		// binary 배열 (0,1만 저장)
		int[] binary =  new int[16];
		// 입력한 정수
		int user = 0;
		// 뒤에서부터 출력하고자 15로 초기화
		int index = 15;
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력(0~32767) : ");
		user = scan.nextInt();
		
		// 이진법 계산
		while(true) {
			// user % 2 = 0 또는 1
			binary[index] = user % 2;
			user = user / 2;
			// user가 0이 될 때는 계산의 끝
			if(user == 0) {
				break;
			}
			// 인덱스 15부터 0까지 진행
			index--;
		}
		
		// 결과 출력
		for(int i = 0; i < 16; i++) {
			if(i % 4 == 0 && i != 0) {
				System.out.println(" ");
			}
			System.out.println(binary[i]);
			
		}

	}

}
