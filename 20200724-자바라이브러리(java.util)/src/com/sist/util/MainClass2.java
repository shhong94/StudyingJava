package com.sist.util;

import java.util.StringTokenizer;

public class MainClass2 {

	public static void main(String[] args) {
		String[] data = {"1|2|3|4|5", "6|7|8", "10|11", "10|11|12|13|14|15"};

		for(int i  = 0; i < data.length; i++) {
			StringTokenizer st = new StringTokenizer(data[i], "|");
			System.out.println("============================");
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				
			}
		}
		
		
	}

}
