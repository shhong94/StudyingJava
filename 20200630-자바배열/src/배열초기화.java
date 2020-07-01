/*
 * 
 */
public class 배열초기화 {

	public static void main(String[] args) {
		// 출력
		String[] names = {"홍길동", "김좌진", "안중근", "이순신", "이성계"};
		
		for(int i = 0; i <= names.length; i++) {
			System.out.println(names[i]);	
		}
		for(String name:names) {
			System.out.println(name);
		}

		
		
	}

}
