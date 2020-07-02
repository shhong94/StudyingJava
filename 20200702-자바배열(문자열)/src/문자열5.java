/*
 * 	◆ split()
 * 		문자열을 구분하여 자르는 역할
 * 		String[]의 형식으로 출력
 * 		★ 문자열일 때만 사용 가능
 * 
 * 	밑반찬,메인반찬,국/탕,찌개,디저트,면/만두,밥/죽/떡,퓨전,김치/젓갈/장류,양념/소스/잼,양식,샐러드,스프,빵,과자,차/음료/술,기타
 */
public class 문자열5 {

	public static void main(String[] args) {
		String msg = "밑반찬,메인반찬,국/탕,찌개,디저트,면/만두,밥/죽/떡,퓨전,김치/젓갈/장류,양념/소스/잼,양식,샐러드,스프,빵,과자,차/음료/술,기타";
		String[] arr = msg.split(",");
		for(String i : arr) {
			System.out.print(i + " ");
		}

	}

}
