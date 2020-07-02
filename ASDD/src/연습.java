/*
 * 
 *  
 */
import javax.swing.*;
import java.util.*;
public class ¿¬½À {
	public static void main(String[] args) {
/*
 *  54321
 *   5432
 *    543
 *     54
 *      5
 */
		for(int a = 1; a <= 5; a++){
			for(int b = 1; b <= a-1; b++) {
				System.out.print(" ");
			}
			for(int c = 5; c >= a; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
