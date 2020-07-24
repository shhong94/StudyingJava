package com.sist.util;

import java.util.*;

public class MainClass1 {
/*
 * 	String msg = new StringTokenizer{"Red, Green, Blue}
 *	 	While(msg.hasMoreTokens){
 *			String color = msg.nextToken();
 *		}
 *	StringTokenizer ss = new StringTokenizer(msg, ",");
 * 
 * 
 */
	public static void main(String[] args) {
		String msg = "Red, Green, Blue";
		StringTokenizer st = new StringTokenizer(msg, ", ");
		
		String color1 = st.nextToken();
		String color2 = st.nextToken();
		String color3 = st.nextToken();
		
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
//		System.out.println(color4);		// 단어 갯수와 일치해야 함
		
//=====================================================================
		
	// 이게 더 편함 (자르는 횟수 알아서 정해줌 (hasMoreTokens())
		st = new StringTokenizer(msg, ", ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
