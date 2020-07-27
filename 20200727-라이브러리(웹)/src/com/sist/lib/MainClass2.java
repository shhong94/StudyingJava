package com.sist.lib;

/*
 * 	ArrayList, Vector, Map
 */

import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
//		ArrayList<String> names = new ArrayList<String>();		// names에는 문자열만 저장 가능
		Vector<String> names = new Vector<String>();
		
		names.add("홍홍홍");
		names.add("김김김");
		names.add("이이이");
		names.add("박박박");
		names.add("도도도");
		
		for(int i = 0; i < names.size(); i++) {					// names.size()만큼 반복
			System.out.println(names.get(i));
		}
		
		names.add(3, "수수수");											// 인덱스 3에 저장
		System.out.println("====================================");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.remove(1);												// 인덱스 1 삭제
		
		System.out.println("====================================");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
