/*
 * 	�� indexOf
 * 		�տ������� Ư�� ������ �ε����� ã��
 * 
 * 	�� lastIndexOf
 * 		�ڿ������� Ư�� ������ �ε����� ã��
 */
public class ���ڿ�4 {

	public static void main(String[] args) {
		String msg = "ddsflkhs.adlkdshlfkjshlkfjsdf.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("Ȯ���� : "+msg.substring(msg.indexOf(".")+1));

	}

}
