package com.sist.exception;
/*
 * 	�� ����ó��
 * 		����Ǵ� ������ �������� ���
 * 		catch�� ������ ���� ������ ������ (����ó���� ��������)
 * 
 * 	�� ��������
 * 		Object- Throwable -Exception - CheckException...
 * 									 - UnCheckException...
 * 		������ �ͺ��� ���� ��� ��
 * 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 int[] arr = new int[2];
			 arr[0] = 100;
			 arr[1] = 0;		
			 
		}catch(NumberFormatException e) {
			System.out.println("������ȯ �Ұ�");
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�����ʰ�");
//		}
		catch (ArithmeticException e) {
			System.out.println("0���� ������");
		}catch (RuntimeException e) {	
			System.out.println("����� ����");
		}catch (Exception e) {
			System.out.println("���������� ��� ����");
		}catch (Throwable e) {
			System.out.println("���ܿ� ���� �Ѵ� ó��");
		}
		System.out.println("���α׷� ����");
	}

}
