package com.sist.util;

import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] resDay = new int[r.nextInt(10)+5];		// �迭 ũ�Ⱑ 5 ~ 14
		
		String day = "";
		
		for(int i = 0; i < resDay.length; i++) {
			resDay[i] = r.nextInt(31)+1;
			day += resDay[i] + "|";
		}
		day = day.substring(0, day.lastIndexOf("|"));		// �� �������� "|"�� ����
		
		System.out.println(day);
		
		StringTokenizer st = new StringTokenizer(day, "|");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "\t");
		}
		
		
		
	}

}
