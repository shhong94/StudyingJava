/*
 * 	5개의 정수 입력
 * 	5개 정수를 선택정렬하여 전송
 * 	
 */
public class 자바메소드1 {
	
	// 선택정렬 메소드
	static int[] sort(int[] arr, String type) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				
				// 오름차순
				if(type.equals("ASC")) {
					if(arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
				
				// 내림차순
				if(type.equals("DESC")) {
					if(arr[i] < arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}	
			}
		}
		
		return arr;
	}
	
	
	
// ============================================================================ 메인
	public static void main(String[] args) {
		// 배열 생성
		int[] arr = {10, 40, 30, 50, 20};
		System.out.print("정렬 전 : ");
		// 정렬 전 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		// 정렬 후 출력
		System.out.print("\n정렬 후 : ");
		int[] result = sort(arr, "DESC");	// 매개변수 2개 집어넣기
		for(int i : result) {
			System.out.print(i + " ");
		}
	}

}

/*
 *	1. 난수 배열 생성, 제출할 답 배열 생성
 *	2. 사용자 입력값 변수 생성
 *	3. 입력값 받기
 *	4. while문 루프
 *		범위 체크
 *		중복 체크
 *		입력값을 한개씩 분리하여 배열에 저장
 *		비교(난수배열 및 답 배열 하나씩 비교)
 *		변수 s와 b 초기화하고 조건문 생성
 *		출력
 * 
*/