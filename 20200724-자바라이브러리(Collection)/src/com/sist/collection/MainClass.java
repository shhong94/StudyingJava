package com.sist.collection;

import java.util.*;

/*
 * 	�� Collection
 * 		1. ���� ���� �ߺ� ����
 * 				List 
 * 		2. ���� ���� �ߺ� �Ұ�
 * 				Set
 * 		3. Ű �� ���ÿ� ����
 * 				Map
 */
public class MainClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(10.5);
//		list.add("ȫȫȫ");
//		
//		int a = (int)list.get(0);
//		double b = (double)list.get(1);
//		String c = (String)list.get(2);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		list.add("ȫȫȫ");
		list.add("����");
		list.add("�ڹڹ�");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		System.out.println(list.get(1));
		
		list.add(1, "������");
		
		System.out.println("=======================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
