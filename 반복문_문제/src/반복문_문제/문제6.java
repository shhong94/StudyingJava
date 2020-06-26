package 반복문_문제;

public class 문제6 {

	public static void main(String[] args) {
		// 변수
		
		// 반복문
		for(int i = 1; i <= 100; i++) {
			if(i % 11 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();

		
		
// ============================================================
		
		
		// 변수
		int i = 1;
		
		// 반복문
		while(i <= 100) {
			if(i % 11 == 0) {
				System.out.print(i + "\t");
			}
			i++;
		}
	}

}
