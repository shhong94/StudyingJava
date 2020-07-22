package com.sist.exception;
/*
 * 	����ó�� ����� ���� ���� Ʋ��
 */
public class MainClass2 {
	
	public static void main(String[] args) {
		try {
			int a = 10;
			if(a % 2 == 0) {
				throw new ArithmeticException("�α��� â���� �̵�");		// ���Ƿ� ���� �߻� (throw)
			}
			else {
				throw new Exception("ȸ������ â���� �̵�");
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
