package com.sist.util;

/*
 * 	◆ Calendar
 * 		요일, 마지막 날짜
 * 		
 */

import java.util.*;

public class MainClass4 {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();		// new 생성자가 아니라 getInstance()를 이용해야 함 (싱클턴 패턴 - 메모리를 한개만 할당)
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);		// MONTH는 0부터 시작하기 때문에 +1을 해줘야 함
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);	// DAY_OF_WEEK는 1부터(일요일부터) 시작하기 떄문에 -1을 해야 함
//		int week = cal.get(Calendar.DAY_OF_WEEK)-1;
//		
//		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
//		System.out.println(strWeek[week] + "요일");
//		
//		System.out.println(cal.getActualMaximum(Calendar.DATE));	// 이번 달의 마지막 날짜
		
	// 연월일 입력받고 요일 출력
		Calendar cal = Calendar.getInstance();
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연도 입력 : ");
		int year = scan.nextInt();
		System.out.println("월 입력 : ");
		int month = scan.nextInt();
		System.out.println("일 입력 : ");
		int day = scan.nextInt();
		
		// Calendar.YEAR/MONTH/DATE 는 오늘 날짜이므로 이걸 입력한 날짜로 바꿔야 함
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);	// month는 0부터 시작하므로 일치시켜줘야 함
		cal.set(Calendar.DATE, day);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);		// MONTH는 0부터 시작하기 때문에 +1을 해줘야 함
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);	// DAY_OF_WEEK는 1부터(일요일부터) 시작하기 떄문에 -1을 해야 함
		int week = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(strWeek[week] + "요일");
	
	}

}
