import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10이상 99 이하의 정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if ((a / 10) - (a % 10) == 0)  // if (a % 11 == 0) 으로도 가능
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}

	}

}
