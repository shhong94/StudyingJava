package ����������;
import java.util.*;
public class Engine {
	int enginePower;
	
	public int onOffEngine() {		
		int onOff = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �õ��� �մϱ�? : ");
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
