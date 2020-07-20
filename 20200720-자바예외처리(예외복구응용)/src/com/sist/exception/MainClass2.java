package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		try {
			
		}catch(ArithmeticException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(NumberFormatException e) {
			
		}
//====================================================== 위아래 같음
		try {
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
		}
		
		
		
		
		
		
	}

}
