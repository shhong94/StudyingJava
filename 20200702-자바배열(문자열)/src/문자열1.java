/*
 * 	
 */
public class 문자열1 {

	public static void main(String[] args) {
		// 정수 5개 저장하여 평균을 구하기
		int[] arr = new int[5];
		int total = 0;
		
		// 난수
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		// 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		// 평균
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println();
		System.out.println();
	}

}
