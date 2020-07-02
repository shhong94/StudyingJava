/*
 * 	◆ indexOf
 * 		앞에서부터 특정 문자의 인덱스를 찾기
 * 
 * 	◆ lastIndexOf
 * 		뒤에서부터 특정 문자의 인덱스를 찾기
 */
public class 문자열4 {

	public static void main(String[] args) {
		String msg = "ddsflkhs.adlkdshlfkjshlkfjsdf.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("확장자 : "+msg.substring(msg.indexOf(".")+1));

	}

}
