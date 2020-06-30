
public class 배열_빈도수계산 {

	public static void main(String[] args) {
	// arr배열 및 중복된숫자가 몇개인지 계산할  count배열 생성
		int[] arr = new int[10];
		int[] count = new int[10];
		
	// arr배열에 난수 주입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
	// arr배열 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=============결과==============\n");
		
	// 중복 숫자 계산
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
	// 결과 출력
		for(int i = 0; i < arr.length; i++) {
			if(count[i] != 0)
			System.out.println(i + "의 갯수 : " + count[i]);
		}
		
		for(int i : count) {
			System.out.println(i);
		}
	}

}
