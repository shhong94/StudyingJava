/*
 * 		0		1		2		3		4
 * 
 *  ==============================================
 * 		1				2				3				0
 * 	==============================================
 * 				4				5						1	
 * 	==============================================
 * 		6				7				8				2
 * 	==============================================
 * 				9				10						3
 * 	==============================================
 * 		11				12				13				4
 * 	==============================================	
 */
import java.util.*;
public class 연습 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("i입력 : ");
	    int i = scan.nextInt();        
	    for(i = 1; i <= 5; i++){
	    	System.out.print("a입력 : ");
	        int a = scan.nextInt();
	        System.out.print("b입력 : ");
	        int b = scan.nextInt();
	        System.out.println(a + b);
	    }
		
	}
}
