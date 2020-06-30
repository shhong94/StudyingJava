/*
 *  임의의 정수 5개 저장 후 
 *  최댓값과 최솟값 구하기
 */
public class 배열_최대최소값 {

	public static void main(String[] args) {
		// 정수 5개를 저장하는 공간
		int[] arr = new int[5];
		
		// 5개의 정수를 난수로 변경
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		
		// 변경된 5개의 정수 확인
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 최댓값 최솟값을 저장하는 변수
		int max = 0;		// 최댓값은 0, 최솟값은 100으로 초기화해야 
		int min = 100;		// 배열 내의 정수들을 하나씩 비교해나갈 수 있음.
							// 만약 최대값이 100, 최소값이 0이면 결과값은 그대로 100과 0이 나와버림
		
		// 최댓값, 최솟값 계산
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}

}
