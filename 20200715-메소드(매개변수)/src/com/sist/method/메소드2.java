package com.sist.method;

import java.lang.reflect.Method;

class A {
	public void display1(String name) {
		System.out.println("Hello \n" + name);
	}
	public void display2(String name) {
		System.out.println("Hello \n" + name);
	}
}
public class �޼ҵ�2 {

	public static void main(String[] args) {
//		A a = new A();
//		a.display("��浢");

		try {
		// Ŭ���� ����ȯ
			Class clsName = Class.forName("com.sist.method.A");
			Object obj = clsName.newInstance();
//			System.out.println(obj);
//			A a = (A)obj;
//			a.display("aaadasdasdas");
			Method[] method = clsName.getDeclaredMethods();
			for(Method m : method) {
				System.out.println(m.getName()	);
			}
		}catch(Exception e) {
			
		}
		
	}

}
