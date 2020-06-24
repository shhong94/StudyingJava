import java.util.*;
public class Timer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현재 시: ");
		int hour = scan.nextInt();
		System.out.print("현재 분: ");
		int minute = scan.nextInt();
		
		// 960 - ((hour * 60) + minute)
		int left = 960 - ((hour * 60) + minute);
		int left_hour = left / 60;
		int left_minute = left % 60;
		
		System.out.printf("면접이 %d시간 %d분 남았습니다.", left_hour, left_minute);

	}

}
