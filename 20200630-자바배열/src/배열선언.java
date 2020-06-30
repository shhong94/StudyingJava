/*
 * 	◆ 배열
 * 		1. 같은 타입인 변수 여러개를 묶어서 관리
 * 		2. 하위 타입의 변수는 포함 가능(double 타입의 배열 안에 int 변수 가능)
 * 		3. 한 개의 변수명을 이용하여 여러 변수를 제어
 * 		4. 메모리 주소(인덱스 번호)를 이용하여 접근하는 변수(참조변수)
 * 		5. 초기화 방법
 * 			① 메모리공간을 미리 만들고 값을 나중에 채우기
 * 				String[] title = new String[10];
 * 			② 값을 직접 대입
 * 				int[] score = {90, 80, 85, 70, 60};
 * 
 */		
public class 배열선언 {

	public static void main(String[] args) {
		// 5명에 대한 점수를 저장
		// 총점과 평균도 구하기
		
		int[] score = {80, 90, 75, 90, 85};
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i <score.length; i++) {
			total = total + score[i];
		}
		avg = total / 5.0;
		
		System.out.println(total);
		System.out.println(avg);
	}

}
