/*
 * 	◆ forEach
 * 		1. 사용되는 때
 * 			① 배열  ② 컬렉션
 * 			JDK 1.5v 이상에서만 사용 가능
 * 		2. 형태
 * 			for(데이터형 변수 : 배열(컬렉션))
 */
public class 반복문_forEach {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.print(i);
		}

	}

}
