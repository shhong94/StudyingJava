package ����������;

public class Main {
	
	
	
	public static void main(String[] args) {		
		// �ν��Ͻ� ����
		Engine ceta = new Engine();	// ���� �ν��Ͻ� ����
		Gauge g1 = new Gauge();		// ����� �ν��Ͻ� ����
		Navi n1 = new Navi();
		
		// �ν��Ͻ� ���� �ʱ�ȭ
		ceta.enginePower = 0;		// ���� �ν��Ͻ� ���� �ʱ�ȭ
		g1.speed = 0;				// ����� �ν��Ͻ� ���� �ʱ�ȭ
		
		
		//�õ��ɱ�
		int onOff = ceta.onOffEngine();
		int speed = g1.UpDownSpeed(onOff);
		g1.informSpeed(speed);
		n1.capture(speed);
		
		

	}

}
