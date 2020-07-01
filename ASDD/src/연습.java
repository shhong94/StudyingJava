/*
 *  사용자 정수 입력
 *  2진법으로 변환하여 출력
 */

import java.util.*;
public class 연습 {
	public static void main(String[] args) {
		// 배열 생성
		int[] arr = new int[5];
		
		// 난수 주입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		// 정렬 전 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		// 선택 정렬
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("\n정렬 후");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
