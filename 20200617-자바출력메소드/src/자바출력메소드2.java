import java.util.Scanner;

public class 자바출력메소드2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. 이름 입력 : ");
		String aname = scan.next();
		
		System.out.print("2. 이름 입력 : ");
		String bname = scan.next();
		
		System.out.println("a 이름 = " + aname);
		System.out.println("b 이름 = " + bname);
	}

}
