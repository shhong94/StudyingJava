package ����������;

import java.util.Scanner;

public class Engine {
	static boolean onOff;
	static String x;
	
	static String start() {	// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �մϱ� (y/n) : ");
		String x = scan.next();
		return x;
	}
	static boolean isStart() {	// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		if(x == "n") {
			System.out.println("�õ��� ���� �ʽ��ϴ�");
			onOff = false;
		}
		else if(x == "y") {
			System.out.println("�õ��� �̴ϴ�");
			onOff = true;
		}
		return onOff;
	}
}
	
//====================================================================================
class Gauge {
	static int speed;
	
	static int setspeed() {				// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		if(Engine.isStart()) {
			Scanner scan = new Scanner(System.in);
			System.out.print("�ӵ� �Է� : ");
			speed = scan.nextInt();
			
			informSpeed(speed);
		}
		return speed;
	}
	static void informSpeed(int speed) {	// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		System.out.println(speed + "�� �ӵ��� �޸��� �ֽ��ϴ�");
	}
	
}
//====================================================================================
class Camera {
	String capture;
	
	static void watch(int speed) {	//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		if(speed > 100) {
			System.out.println("����ī�޶� ����");
			Engine.onOff = false;
			
		}
		else {
			Gauge.informSpeed(speed);
		}
	}
}
//=====================================================================================


