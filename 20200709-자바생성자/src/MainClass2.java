// 차량의 색상, 연비, 연도
public class MainClass2 {
	// 변수선언
	int a = 10;
	int b = 20;
	
	// 생성자
	MainClass2() {
		a = 100;
		b = 200;
	}
	
	// 초기값을 다르게 입력하면서 인스턴스를 생성하는 경우
	MainClass2(int c, int d){	// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		a = c;
		b = d;
	}
	public static void main(String[] args) {
		MainClass2 m = new MainClass2();
		System.out.println(m.a);
		System.out.println(m.b);
		
		MainClass2 m1 = new MainClass2(1000, 2000);		// ☆★☆★☆★☆★☆★☆★☆★
		System.out.println(m1.a);
		System.out.println(m1.b);
	}

}
