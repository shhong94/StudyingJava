package 정말연습스;
import java.io.*;

public class MovieManager2 {
	// 모든 클래스에서 공유할 때는 static
	static MovieVO2[] movies = new MovieVO2[1938];
	
	static {
		try {
			StringBuffer data = new StringBuffer();
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			while((i = fr.read()) != -1) {
				data.append(String.valueOf((char)i));
			}
			fr.close();
			
			String[] movieData = data.toString().split("\n");
			int k = 0;
			for(String vo : movieData) {
				String[] ss = vo.split("\\|");
				movies[k] = new MovieVO2();
				movies[k].mno = Integer.parseInt(ss[0]);
				movies[k].title = ss[1];
				movies[k].genre = ss[2];
				movies[k].poster = ss[3];
				movies[k].actor = ss[4];
				movies[k].regdate = ss[5];
				movies[k].grade = ss[6];
				movies[k].director = ss[7];
				k++;
			}
		}catch(Exception ex) {}
	}

}
