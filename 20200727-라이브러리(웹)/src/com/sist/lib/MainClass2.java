package com.sist.lib;

/*
 * 	ArrayList, Vector, Map
 */

import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
//		ArrayList<String> names = new ArrayList<String>();		// names���� ���ڿ��� ���� ����
		Vector<String> names = new Vector<String>();
		
		names.add("ȫȫȫ");
		names.add("����");
		names.add("������");
		names.add("�ڹڹ�");
		names.add("������");
		
		for(int i = 0; i < names.size(); i++) {					// names.size()��ŭ �ݺ�
			System.out.println(names.get(i));
		}
		
		names.add(3, "������");											// �ε��� 3�� ����
		System.out.println("====================================");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.remove(1);												// �ε��� 1 ����
		
		System.out.println("====================================");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
