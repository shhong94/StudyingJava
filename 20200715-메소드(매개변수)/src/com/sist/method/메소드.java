/*
 * 	◆ 가변 매개변수
 * 		Object... o
 *		String... s 
 * 
 */

package com.sist.method;

public class 메소드 {

	public static void concat(String s, String... s1) {
		for(String ss: s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		concat("hello", "헝길덩", "가가가");

	}

}
