package com.sist.util;

/*
 * 	�� Calendar
 * 		����, ������ ��¥
 * 		
 */

import java.util.*;

public class MainClass4 {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();		// new �����ڰ� �ƴ϶� getInstance()�� �̿��ؾ� �� (��Ŭ�� ���� - �޸𸮸� �Ѱ��� �Ҵ�)
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);		// MONTH�� 0���� �����ϱ� ������ +1�� ����� ��
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);	// DAY_OF_WEEK�� 1����(�Ͽ��Ϻ���) �����ϱ� ������ -1�� �ؾ� ��
//		int week = cal.get(Calendar.DAY_OF_WEEK)-1;
//		
//		String[] strWeek = {"��", "��", "ȭ", "��", "��", "��", "��"};
//		System.out.println(strWeek[week] + "����");
//		
//		System.out.println(cal.getActualMaximum(Calendar.DATE));	// �̹� ���� ������ ��¥
		
	// ������ �Է¹ް� ���� ���
		Calendar cal = Calendar.getInstance();
		String[] strWeek = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int year = scan.nextInt();
		System.out.println("�� �Է� : ");
		int month = scan.nextInt();
		System.out.println("�� �Է� : ");
		int day = scan.nextInt();
		
		// Calendar.YEAR/MONTH/DATE �� ���� ��¥�̹Ƿ� �̰� �Է��� ��¥�� �ٲ�� ��
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);	// month�� 0���� �����ϹǷ� ��ġ������� ��
		cal.set(Calendar.DATE, day);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);		// MONTH�� 0���� �����ϱ� ������ +1�� ����� ��
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);	// DAY_OF_WEEK�� 1����(�Ͽ��Ϻ���) �����ϱ� ������ -1�� �ؾ� ��
		int week = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(strWeek[week] + "����");
	
	}

}
