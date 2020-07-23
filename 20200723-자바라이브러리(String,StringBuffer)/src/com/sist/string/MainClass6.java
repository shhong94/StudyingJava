package com.sist.string;

/*
 * 	1. join
 * 	2. format
 */

public class MainClass6 {

	public static void main(String[] args) {
		String[] arr = {"È«È«È«", "±è±è±è", "¹Ú¹Ú¹Ú", "ÀÌÀÌÀÌ", "½É½É½É"};
		System.out.println(String.join("-", arr));
		
		String str = String.format("%d - %d = %d", 10, 2, 10-2);
		System.out.println(str);
		
		
		
	}

}
