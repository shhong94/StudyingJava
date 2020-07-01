/*
 *  byte[] b => 파일 전송
 *  String[] s => 문자열이 많은 경우
 *  int[] i => 성적계산, 통계 등
 *  double[] d => 통계, 빈도수 등
 */
/*
 * 	문자 갯수 확인
 * 	a.length()
 * 
 * 	문자열 내에서 문자 1개 추출
 * 	a.charAt(0)
 */

public class 자바배열_용도4 {

	public static void main(String[] args) {
		String[] s = {
			"apple",
			"strawBerry",
			"grape",
			"pear",
			"cherry",
			"banana",
			"melon"
		};
		
		// 과일명 중에 가장 긴 과일
		// 전체 과일 출력
		System.out.println("=========== 전체 과일명 ===========");
		for(String i : s) { // 인덱스가 존재하지 않음
			System.out.println(i);
		}
		System.out.println("================================");
		System.out.println("과일명이 가장 긴 과일은?");
		// 과일명이 가장 긴 과일 계산
		int max = 0;
		for(String i : s) {
			int len = i.length();
			if(max < len) {
				max = len;
			}
		}
		// 출력
		for(String i : s) {
			if(i.length() == max) {
				System.out.println(i);
			}
		}
		
		System.out.println("================================");
		System.out.println("과일명이 가장 짧은 과일은?");
		
		// 과일명이 가장 짧은 과일 계산
				int min = 100;
				for(String i : s) {
					int len = i.length();
					if(min > len) {
						min = len;
					}
				}
				// 출력
				for(String i : s) {
					if(i.length() == min) {
						System.out.println(i);
					}
				}

		System.out.println("==================================");
		String msg = "Hello Java";
		System.out.println(msg);
		System.out.print("5번째 문자 : ");
		for(int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
		
	}

}
