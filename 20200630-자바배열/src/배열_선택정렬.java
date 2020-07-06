/*
 * 	◆ DESC 내침차순
 * 	◆ ASC 오름차순
 * 
 * 	20 10 40 50 30
 * 
 * 	◆ 선택정렬
 * 		맨 앞에 있는 값과 다음 값들을 순차적으로 비교해나가는 방식 (앞에서부터 순서를 맞춰나감)
 * 	◆ 버블정렬
 * 		arr[0]과 arr[1], 1과2, 2와3, 3과4, 4와5 순으로 비교 (뒤에서부터 순서를 맞춰나감)
 */
public class 배열_선택정렬 {

	public static void main(String[] args) {
		// 정수 저장
		int[] arr = {4, 8, 2, 10, 6};
		
		// 정렬 전 출력
		System.out.println("정렬 전 ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n정렬 후");
		
		// 선택 정렬 내림차순
		for(int i = 0; i < arr.length-1; i++) {			// i는 0부터 시작
			for(int j = i+1; j < arr.length; j++) {		// j는 i 뒤부터 시작(j=i+1)
				if(arr[i] > arr[j]) {					// j<arr.length 의 의미
					int tmp = arr[i];					// i가 j를 비교하는 횟수는 4회.
					arr[i] = arr[j];					// 배열 arr의 크기는 5이므로 j는 arr.lenght(4)까지 증가
					arr[j] = tmp;
				}
			}
			System.out.println();
			System.out.println("=================");
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}
		
		System.out.println();
		System.out.println("======= 결과  =======");
		// 정렬 후 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
