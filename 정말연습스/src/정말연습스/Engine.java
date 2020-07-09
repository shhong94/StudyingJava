package 정말연습스;
import java.util.*;
public class Engine {
	int enginePower;
	
	public int onOffEngine() {		
		int onOff = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("엔진 시동을 켭니까? : ");
		String input = scan.next();
		if(input.equals("y")) {
			onOff = 1;
		}
		else if(input.equals("n")) {
			onOff = 0;
		}
		return onOff;
	}
}
