/*
 * 1|���ũ Ż��|���|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|�� �κ�(�ص� ��������), ��� ������(������ ���̵� ���� ����)|2016 .02.24 �簳��, 1995 .01.28 ����|15�� ������|����ũ �ٶ�Ʈ
 */
import java.io.*;
public class OldMovieManager {
	// ��� Ŭ�������� ������ ��� static ���
	static MovieVO[] movies = new MovieVO[1938];
	
	// ���α׷� ���� �����ϸ� "�ڵ�����" ������ �о �迭�� �����ϱ� ���� �ʱ�ȭ ��� ���
	static String data = "";
	static {
		try {
			// ������ ���� �� �ݵ�� ����ó��
			// try catch : ����ڰ� ���� ������ ��´�		throws exception : ������ �ý��ۿ��� «������
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			while((i = fr.read()) != -1) {		// -1�� ������ ���� ������ ������� ��(EOF(End of File))
				data += String.valueOf((char)i);				
			}
			fr.close();
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		System.out.println(data);
	}
}
