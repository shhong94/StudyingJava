package ����������;
import java.util.*;
public class Gauge {
	int speed;
	
	public int UpDownSpeed(int onOff) {
		int inputSpeed = 0;
		if(onOff == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.print("�ӵ� ���� : ");
			inputSpeed = scan.nextInt();
		}
		else if(onOff == 0){
			System.out.println("�õ��� ���� �ɾ��ּ���");
		}
		return inputSpeed;
	}
	
	public void informSpeed(int inputSpeed) {
		System.out.println(inputSpeed + "�� �ӵ��� �̵� ���Դϴ�");
	}
}
