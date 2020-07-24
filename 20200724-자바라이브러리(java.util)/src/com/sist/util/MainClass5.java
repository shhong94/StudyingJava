package com.sist.util;

import java.util.*;

public class MainClass5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 해당 월의 첫/마지막 요일 구하기
		int week = cal.get(Calendar.DAY_OF_WEEK)-1;			// strweek 배열이 0부터 시작이라 day_of_week도 0부터 시작해야 함. 따라서 1을 빼줌
		int lastDay = cal.getActualMaximum(Calendar.DATE);	
		
		// 출력
//		System.out.print("첫 요일 : " + strWeek[week] + "\n");
//		System.out.println("마지막 날짜 : " + lastDay);
		System.out.println(year + "년도 " + month + "월");
		for(int i = 0; i < 7; i++) {
			System.out.print(strWeek[i] + "\t");
		}
		System.out.println();
		
		
		for(int i = 1; i <= lastDay; i++) {
			if(i == 1) {
				for(int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6) {
				week = 0;
				System.out.println();
			}
		}
	}

}
