package 정말연습스;
import java.util.*;
public class Gauge {
	int speed;
	
	public int UpDownSpeed(int onOff) {
		int inputSpeed = 0;
		if(onOff == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.print("속도 설정 : ");
			inputSpeed = scan.nextInt();
		}
		else if(onOff == 0){
			System.out.println("시동을 먼저 걸어주세요");
		}
		return inputSpeed;
	}
	
	public void informSpeed(int inputSpeed) {
		System.out.println(inputSpeed + "의 속도로 이동 중입니다");
	}
}
