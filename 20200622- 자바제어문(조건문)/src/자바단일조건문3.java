// Á¶°Ç¹® Á¦ÀÛÇÏ´Â ¹æ¹ý

/*
 *  Á¶°Ç¹®ÀÇ °á°ú´Â ºÒ¸°°ªÀ¸·Î.
 *  
 */
public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {

	public static void main(String[] args) {
//		int a = 10;
//		
//		System.out.println("1");
//		System.out.println("2");
//		
//		//a°¡ Â¦¼öÀÏ ¶§¸¸ Ãâ·Â
//		if (a % 2 == 0)
//			System.out.println("3");
//		
//		System.out.println("4");
//		System.out.println("5");
		
		// ¾ËÆÄºªÀ» ÀúÀåÇÏ°í ´ë¹®ÀÚ / ¼Ò¹®ÀÚÀÎÁö Ãâ·Â
		char alpha = '°®';
		if (alpha >= 'A' && alpha <= 'Z')
			System.out.println(alpha + "´Â(Àº) ´ë¹®ÀÚÀÔ´Ï´Ù.");
		
		if (alpha >= 'a' && alpha <= 'z')
			System.out.println(alpha + "´Â(Àº) ¼Ò¹®ÀÚÀÔ´Ï´Ù.");
	
		if (alpha >= '0' && alpha <= '9')
			System.out.println(alpha + "´Â(Àº) ¼ýÀÚÀÔ´Ï´Ù.");
		
		if (alpha >= '°¡' && alpha <= 'ÆR')
			System.out.println(alpha + "´Â(Àº) ÇÑ±ÛÀÔ´Ï´Ù.");
		
		if (alpha == '\t' || alpha == '\n')
			System.out.println(alpha + "´Â(Àº) ÇÑ±ÛÀÔ´Ï´Ù.");
		
	}

}
