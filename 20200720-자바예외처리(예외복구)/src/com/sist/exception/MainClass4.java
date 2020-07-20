package com.sist.exception;
/*
 * 	◆ 다중처리
 * 		예상되는 에러가 여러개일 경우
 * 		catch를 여러개 사용시 순서가 존재함 (예외처리의 계층구조)
 * 
 * 	◆ 계층구조
 * 		Object- Throwable -Exception - CheckException...
 * 									 - UnCheckException...
 * 		세세한 것부터 먼저 써야 함
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
			System.out.println("정수변환 불가");
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열범위초과");
//		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눗셈");
		}catch (RuntimeException e) {	
			System.out.println("실행시 에러");
		}catch (Exception e) {
			System.out.println("수정가능한 모든 에러");
		}catch (Throwable e) {
			System.out.println("예외와 에러 둘다 처리");
		}
		System.out.println("프로그램 종료");
	}

}
