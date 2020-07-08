package 정말연습스;

public class Main {
	
	static void process() {
		while(true) {
			String x = Engine.start();
			Engine.isStart();
			int speed = Gauge.setspeed();
			Camera.watch(speed);
		}
	}
	
	public static void main(String[] args) {
		process();

	}

}
