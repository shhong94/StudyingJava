import java.util.*;
public class 선택문2 {

	public static void main(String[] args) throws Exception {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"======메뉴======\n"
				+ "홈(1)\n현재상영영화(2)\n개봉예정영화(3)\n박스오피스(4)\n"
				+ "영화예매(5)\n영화뉴스(6)\n"
				+ "===============\n");
		System.out.print("메뉴를 선택하세요 : ");
		menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
			break;
		case 2:
		case 3:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/premovie/released");
			break;
		case 4:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/boxoffice/weekly");
			break;
		case 5:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://ticket2.movie.daum.net/Movie/MovieMain.aspx#seq=1");
			break;
		case 6:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/magazine/new");
			break;	
		default:
			System.out.println("메뉴가 존재하지 않습니다");
		}
		
	}

}
