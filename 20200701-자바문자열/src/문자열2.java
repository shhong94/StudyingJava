/*
 *  contains() 영화제목 일부만 알아도 됨 			
 *  equals() 영화제목을 띄어쓰기까지 모두 다 알아야됨(정확한 정보)
 *  
 */

import javax.swing.*;
import java.util.*;
public class 문자열2 {
	
	// contains() 사용
	

	public static void main(String[] args) {
		String[] title = {
			"#살아있다",
			"결백", 
			"사라진 시간", 
			"침입자", 
			"온워드: 단 하루의 기적", 
			"야구소녀", 
			"반도",	
			"엔딩스 비기닝스", 
			"배트맨 비긴즈", 
			"위대한 쇼맨",
		};
		String[] actor = {
			"유아인(오준우), 박신혜(김유빈)",
			"신혜선(정인), 배종옥(화자), 허준호(추시장)", 
			"조진웅(박형구), 배수빈(김수혁), 정해균(정해균)", 
			"송지효(유진), 김무열(서진)", 
			"톰 홀랜드(이안 라이트풋 목소리), 크리스 프랫(발리 라이트풋 목소리), 줄리아 루이스 드레이퍼스(로렐 라이트풋 목소리)", 
			"이주영(주수인), 이준혁(최진태)", 
			"강동원, 이정현",	
			"쉐일린 우들리(다프네), 제이미 도넌(잭), 세바스찬 스탠(프랭크)", 
			"크리스찬 베일(브루스 웨인/배트맨), 마이클 케인(알프레드), 리암 니슨(듀카드)", 
			"휴 잭맨(P.T. 바넘), 잭 에프론(필립 칼라일), 미셸 윌리엄스(채러티 바넘)",	
		};
		
		// javax.swing 내의 메소드
		String ss = JOptionPane.showInputDialog("검색어 입력");
		
		// title배열 싹 훑어보리기
//		String tmp = " ";
//		for(String s : title) {
//			// s안에 ss가 있는지 확인
//			if(s.contains(ss)) {
//				// s 안에 ss가 있으면 s 출력
//				System.out.println(s);
//			}
//		}
		
		// title배열 싹 훑어보리기
		String tmp = " ";
		for(String s : title) {
			// s안에 ss가 있는지 확인
			if(s.contains(ss)) {
				// s 안에 ss가 있으면 줄바꿈
				tmp = tmp + s +"\n";
			}
		}
		// 창 띄워서 s 출력
		JOptionPane.showMessageDialog(null, tmp);
		

	}

}
