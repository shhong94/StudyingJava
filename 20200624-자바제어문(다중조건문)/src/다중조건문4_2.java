/*
 * 	¹®ÀÚ¸¦ ÀÔ·Â¹Þ¾Æ
 * 	¼ýÀÚ, ¾ËÆÄºª, ÇÑ±Û, Æ¯¼ö¹®ÀÚ
 */
import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®4_2 {

	public static void main(String[] args) {
	// º¯¼ö
		char ch = 'a';
	// ÀÔ·Â°ª ¹Þ±â
		Scanner scan = new Scanner(System.in);
		System.out.print("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		ch = scan.next().charAt(0);
	// ¼ýÀÚ
		if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "Àº(´Â) ¼ýÀÚÀÔ´Ï´Ù");
		}
	// ¾ËÆÄºª
		else if (ch >= 'A' && ch <= 'z') {
			System.out.println(ch + "Àº(´Â) ¾ËÆÄºªÀÔ´Ï´Ù");
		}
	// ÇÑ±Û
		else if (ch >= '°¡' && ch <= 'ÆR') {
			System.out.println(ch + "Àº(´Â) ÇÑ±ÛÀÔ´Ï´Ù");
		}
	// Æ¯¼ö¹®ÀÚ
		else {
			System.out.println(ch + "Àº(´Â) Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù");
		}
	}

}
