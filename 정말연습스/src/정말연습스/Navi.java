package 정말연습스;

public class Navi {
	
	public void capture(int speed) {
		if(speed > 100) {
			System.out.println("속도가 100 이상입니다. 감시카메라에 포착되었습니다");
		}
		else {
			System.out.println("안전한 운행 되십시오");
		}
	}
}
