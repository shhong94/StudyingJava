/*
 *  
 */
class MovieInfo {
	// �ν��Ͻ� ����
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String siteName;
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		MovieInfo m1 = new MovieInfo();
		m1.title = "#����ִ�";
		m1.director = "������";
		m1.actor = "������";
		m1.reserve = 17.3;
		m1.rank = 2;
		m1.siteName = "CGV";
		
		MovieInfo m2 = new MovieInfo();
		m2.title = "��ũ ����Ʈ ������";
		m2.director = "ũ�������� ���";
		m2.actor = "ũ������ ����";
		m2.reserve = 7.8;
		m2.rank = 4;
		m1.siteName = "�Ե��ó׸�";
		
		MovieInfo m3 = new MovieInfo();
		m3.title = "�� ����";
		m3.director = "�� ������";
		m3.actor = "�� �ؼ�����";
		m3.reserve = 1.3;
		m3.rank = 6;
		m3.siteName = "�ް��ڽ�";

		MovieInfo.siteName = "�������";
		
		MovieInfo[] info = new MovieInfo[3];
		
	}

}
