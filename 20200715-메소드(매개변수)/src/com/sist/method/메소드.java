/*
 * 	�� ���� �Ű�����
 * 		Object... o
 *		String... s 
 * 
 */

package com.sist.method;

public class �޼ҵ� {

	public static void concat(String s, String... s1) {
		for(String ss: s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		concat("hello", "��浢", "������");

	}

}
