
public class 선택문5 {

	public static void main(String[] args) {
		int a = 10;
		
		switch(a) {
		case 10:{		// case 10에 블록을 형성하면 변수 b는 블록 내에서만 사용 가능. case 10이 끝나면 변수 b는 사라짐.
			int b = 100;
			System.out.println("a = " + a + " b = " + b);
			break;
			}
		case 11:{
			int b = 200;
			System.out.println("a = " + a + " b = " + b);
			break;
			}
		}

	}

}
