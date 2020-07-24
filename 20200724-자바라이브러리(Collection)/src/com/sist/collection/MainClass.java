package com.sist.collection;

import java.util.*;

/*
 * 	¡ß Collection
 * 		1. ¼ø¼­ Á¸Àç Áßº¹ °¡´É
 * 				List 
 * 		2. ¼ø¼­ ¾øÀ½ Áßº¹ ºÒ°¡
 * 				Set
 * 		3. Å° °ª µ¿½Ã¿¡ ÀúÀå
 * 				Map
 */
public class MainClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(10.5);
//		list.add("È«È«È«");
//		
//		int a = (int)list.get(0);
//		double b = (double)list.get(1);
//		String c = (String)list.get(2);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		list.add("È«È«È«");
		list.add("±è±è±è");
		list.add("¹Ú¹Ú¹Ú");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		System.out.println(list.get(1));
		
		list.add(1, "À¯À¯À¯");
		
		System.out.println("=======================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
