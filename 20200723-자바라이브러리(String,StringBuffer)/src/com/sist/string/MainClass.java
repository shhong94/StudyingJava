package com.sist.string;
/*
 *  ◆ String
 *  	1. 모든 문자열은 주소다
 *  	2. char 배열을 제어하는 클래스다	
 *  ◆ 주요 기능
 *  	1. length() : 문자 갯수
 *  	2. trim() : 좌우 공백 제거
 *  	3. substring() : 문자 분해
 *  	4. indexOf() : 문자의 인덱스
 *  	5. equals() : 문자 비교
 *  	6. contains() : 포함여부
 *  	7. startsWith() : 처음부터 찾기
 *  	8. endsWith() : 마지막부터 찾기
 *  	9. valueOf() : 모든 데이터형을 문자열로 변환
 */
public class MainClass {
	public static void main(String[] args) {
		// 원하는 문자열 떼오기
		String s = "background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg')";
		String temp = s.substring(s.indexOf("'")+1, s.lastIndexOf("'"));
		System.out.println(temp);
		
		// 문자열 갯수 제한
		String ss = "예쁜 서해바다를 보면서 즐기는 애프터눈티. 조식먹는 곳 보다 뷰가 시원하지 않은게 아쉽지만 날 좋은 때 오후를 보내기에 나쁘지 않다. 샌드위치는";
		if(ss.length() > 20) {
			String sss = ss.substring(0, 20) + "...";
			System.out.println(sss);
		}
		
		// 문자열 비교
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		if(s1.equals(s3)) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		
		
	}

}
