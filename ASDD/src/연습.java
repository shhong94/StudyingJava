/*
 *  ����� ���� �Է�
 *  2�������� ��ȯ�Ͽ� ���
 */

import java.util.*;
public class ���� {
	public static void main(String[] args) {
		// �迭 ����
		int[] arr = new int[5];
		
		// ���� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		// ���� �� ���
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		// ���� ����
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("\n���� ��");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
