/*
 *  ◆ 변수 : 변경해서 사용가능한 메모리 기억 공간 (프로그램 종료 시 자동으로 메모리에서 사라짐)
 *  ◆ 상수 : 변경할 수 없는 값
 *  
 *  ◆ 변수의 종류
 *  	1. 변수
 *  		한개의 데이터를 저장하는 공간
 *  	2. 배열
 *  		같은 타입 여러 개 저장
 *  	3. 클래스
 *  		다른 타입 여러 개 저장
 *  		① 데이터형 클래스 : 변수로만 사용(사용자 정의 데이터형)
 *  		② 액션 클래스 : 기능만 설정
 *  
 *  ◆ 자주 쓰이는 데이터형
 *  	1. 정수(int, long)
 *  	2. 실수(double)
 *  	3. 불린(boolean)
 *  	4. 문자열(String)
 */
public class 변수정리 {

	public static void main(String[] args) {
		// 난수를 저장할 배열
		int[] com = new int[10];
		
		// 난수값 저장
		int random = 0;
		
		// 중복 없으면 저장, 중복되면 난수를 다시 발생
		boolean check = false;
		for(int i = 0; i < 10; i++) {
			//중복 여부 확인
			check = true;
			while(check) {
				// 난수 발생
				random = (int)(Math.random()*10)+1;
				// 종료 확인
				check = false;
				// 같은 수가 저장되었는지 비교
				for(int j = 0; j < i; j++) {
					if(com[j] == random) {
						check = true;
						break;
					}
				}
			}
			// while문이 종료시 com 배열에 난수 저장
			com[i] = random;	
		}
		for(int i : com) {
			System.out.print(i + " ");
		}
		
		

	}

}
