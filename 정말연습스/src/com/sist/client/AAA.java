package com.sist.client;

import java.util.*;

public class AAA {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int year = scan.nextInt();
		System.out.println("�� �Է�:");
		int month = scan.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
