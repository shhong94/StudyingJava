package 반복문_문제;

public class 문제5 {

	public static void main(String[] args) {
		// 변수
		int multiple7 = 0;
		int multiple9 = 0;
		
		// 반복문
		for(int i = 1; i <= 1000; i++) {
			if(i % 7 == 0) {
				multiple7 += i;
			}
			if(i % 9 == 0) {
				multiple9 += i;
			}
		}
		
		// 출력
		System.out.println("7의 배수 : " + multiple7);
		System.out.println("9의 배수 : " + multiple9);
		System.out.println("7의 배수 + 9의 배수 : " + (multiple7 + multiple9));
		
		
// ===============================================================================
		
		
		// 변수
		int multiple77 = 0;
		int multiple99 = 0;
		int i = 1;
		
		// 반복문
		while(i <= 1000) {
			if(i % 7 == 0) {
				multiple77 += i;
			}
			if(i % 9 == 0) {
				multiple99 += i;
			}
			i++;
		}
		System.out.println("7의 배수 : " + multiple77);
		System.out.println("9의 배수 : " + multiple99);
		System.out.println("7의 배수 + 9의 배수 : " + (multiple77 + multiple99));
		
		
	}

}
