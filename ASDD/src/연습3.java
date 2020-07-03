
public class 연습3 {

	public static void main(String[] args) {
// 난수 저장할 배열
		int[] arr = new int[10];
		

// i가 0부터 배열크기까지 반복하여 난수 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
	// j가 0부터 i까지 반복하여 중복되는지 비교
			for(int j = 0; j < i; j++) {
		// arr배열의 i인덱스 값과 j인덱스값이 같을 때
				if(arr[i] == arr[j]) {
					arr[j] = (int)(Math.random()*10)+1;	// j인덱스에 다시 난수 주입
					i = 0;							// i를 0으로 초기화하여 1번째 for문 실행
				}
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		System.out.print("합계 : ");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
