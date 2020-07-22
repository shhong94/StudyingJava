package com.sist.exception;
/*
 * 	예외처리 결과에 따라 방향 틀기
 */
public class MainClass2 {
	
	public static void main(String[] args) {
		try {
			int a = 10;
			if(a % 2 == 0) {
				throw new ArithmeticException("로그인 창으로 이동");		// 임의로 에러 발생 (throw)
			}
			else {
				throw new Exception("회원가입 창으로 이동");
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
