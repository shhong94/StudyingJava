package com.sist.exception;

// MainClass3에서 저장한 데이터를 가져오기

public class MainClass4 {

	public static void main(String[] args) {
		CategoryVO[] cate = MainClass3.categoryListData();
		for(CategoryVO vo : cate) {
			System.out.println(vo.getCno());
			System.out.println(vo.getTitle());
			System.out.println(vo.getSubject());
			System.out.println(vo.getPoster());
			System.out.println("============================");
		}

	}

}
