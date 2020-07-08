package 정말연습스;

import java.util.Scanner;

public class Engine {
	static boolean onOff;
	static String x;
	
	static String start() {	// ★★★★★★★★★★★★★★★★★★★★★
		Scanner scan = new Scanner(System.in);
		System.out.print("엔진을 켭니까 (y/n) : ");
		String x = scan.next();
		return x;
	}
	static boolean isStart() {	// ★★★★★★★★★★★★★★★★★★★★★
		if(x == "n") {
			System.out.println("시동을 걸지 않습니다");
			onOff = false;
		}
		else if(x == "y") {
			System.out.println("시동을 겁니다");
			onOff = true;
		}
		return onOff;
	}
}
	
//====================================================================================
class Gauge {
	static int speed;
	
	static int setspeed() {				// ★★★★★★★★★★★★★★★★★★★★★
		if(Engine.isStart()) {
			Scanner scan = new Scanner(System.in);
			System.out.print("속도 입력 : ");
			speed = scan.nextInt();
			
			informSpeed(speed);
		}
		return speed;
	}
	static void informSpeed(int speed) {	// ★★★★★★★★★★★★★★★★★★★★★
		System.out.println(speed + "의 속도로 달리고 있습니다");
	}
	
}
//====================================================================================
class Camera {
	String capture;
	
	static void watch(int speed) {	//★★★★★★★★★★★★★★★★★★★★★
		if(speed > 100) {
			System.out.println("감시카메라 포착");
			Engine.onOff = false;
			
		}
		else {
			Gauge.informSpeed(speed);
		}
	}
}
//=====================================================================================


