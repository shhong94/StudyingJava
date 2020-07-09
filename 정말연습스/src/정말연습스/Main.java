package 정말연습스;

public class Main {
	
	
	
	public static void main(String[] args) {		
		// 인스턴스 생성
		Engine ceta = new Engine();	// 엔진 인스턴스 생성
		Gauge g1 = new Gauge();		// 계기판 인스턴스 생성
		Navi n1 = new Navi();
		
		// 인스턴스 변수 초기화
		ceta.enginePower = 0;		// 엔진 인스턴스 변수 초기화
		g1.speed = 0;				// 계기판 인스턴스 변수 초기화
		
		
		//시동걸기
		int onOff = ceta.onOffEngine();
		int speed = g1.UpDownSpeed(onOff);
		g1.informSpeed(speed);
		n1.capture(speed);
		
		

	}

}
