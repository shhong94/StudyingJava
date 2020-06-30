
public class 배열_버블정렬 {

	public static void main(String[] args) {
		// 배열 생성
		int[] arr = {3, 2, 4, 5, 1};
/*	i
 * 		
 */
		// 정렬 전 출력
		System.out.println("정렬 전");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n정렬 후");
		
		// 버블정렬
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		// 정렬 후 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		

	}

}
