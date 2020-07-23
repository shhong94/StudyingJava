package com.sist.string;
/*
 *  �� String
 *  	1. ��� ���ڿ��� �ּҴ�
 *  	2. char �迭�� �����ϴ� Ŭ������	
 *  �� �ֿ� ���
 *  	1. length() : ���� ����
 *  	2. trim() : �¿� ���� ����
 *  	3. substring() : ���� ����
 *  	4. indexOf() : ������ �ε���
 *  	5. equals() : ���� ��
 *  	6. contains() : ���Կ���
 *  	7. startsWith() : ó������ ã��
 *  	8. endsWith() : ���������� ã��
 *  	9. valueOf() : ��� ���������� ���ڿ��� ��ȯ
 */
public class MainClass {
	public static void main(String[] args) {
		// ���ϴ� ���ڿ� ������
		String s = "background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg')";
		String temp = s.substring(s.indexOf("'")+1, s.lastIndexOf("'"));
		System.out.println(temp);
		
		// ���ڿ� ���� ����
		String ss = "���� ���عٴٸ� ���鼭 ���� �����ʹ�Ƽ. ���ĸԴ� �� ���� �䰡 �ÿ����� ������ �ƽ����� �� ���� �� ���ĸ� �����⿡ ������ �ʴ�. ������ġ��";
		if(ss.length() > 20) {
			String sss = ss.substring(0, 20) + "...";
			System.out.println(sss);
		}
		
		// ���ڿ� ��
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		if(s1.equals(s3)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ�");
		}
		
		
	}

}
