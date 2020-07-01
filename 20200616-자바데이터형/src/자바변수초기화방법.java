
public class 자바변수초기화방법 {

	public static void main(String[] args) {
		int y = 1;
		while (y <= 9) {
			int x = 1;
			while (x<=9) {
				System.out.println(x + " * " + y + " = " + (x * y));
				x += 1;
			}
		y += 1;
		}

	}
}
