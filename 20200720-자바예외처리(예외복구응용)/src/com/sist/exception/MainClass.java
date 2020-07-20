package com.sist.exception;
/*
 * 	�� ����ó���� ����
 * 		1. �ϳ����� ó��
 * 				NumberFormatException
 * 				ArrayIndexOutOfBoundsException
 * 				NullPointerException
 * 				IOException
 * 				SQLException
 * 		2. ������ ó��
 * 				RuntimeException
 * 				Exception
 * 				Throwable
 * 
 * 	�� ����ó�� ����
 * 		1. ���� �ڹ��� ��� �ڵ忡�� ����ó���� �����Ǿ�����
 * 			(Ư���� ��쿡�� ����ó���� ���� �ؾ� ��. if������ �ַ� ó��)
 * 		2. �ݵ�� ����ó�� �ؾ� �ϴ� ���
 * 			IO, ������, ��Ʈ��ũ, �����ͺ��̽�....
 * 		
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		try {
			String num1 = JOptionPane.showInputDialog("ù��° ���� �Է� :");
			String num2 = JOptionPane.showInputDialog("�ι�° ���� �Է� :");
		// �迭�� ÷��
			int[] arr = new int[2];
		// ���ڿ��� ������ ��ȯ
			arr[0] = Integer.parseInt(num1);
			arr[1] = Integer.parseInt(num2);
			
			int result = arr[0]/arr[1];
			System.out.println("result =" + result);
		}
//		catch(NumberFormatException e) {
//			System.out.println("������ �Է�");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭���� �ʰ�");
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ���� �� ����");
//		}
		catch(RuntimeException e) {
//			System.out.println(e.getMessage());		// ������ ������ ��� ���������� �𸣹Ƿ�
			e.printStackTrace();
		}											// e.getMessage() �޼ҵ� ���
		System.out.println("���α׷� ����");
	}
}
