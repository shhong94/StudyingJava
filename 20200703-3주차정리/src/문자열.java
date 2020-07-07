/*
 * 	◆ 기본형 
 * 		정수, 실수, 논리...
 * 	◆ 참조형
 * 		배열, 클래스...
 * 		실제 저장장소는 다른곳에 있고, 저장은 주소
 * 
 * 	◆ 문자열 관련 메소드의 주요 기능
 * 		1. length() : 문자 갯수 출력
 * 		2. substring(0, 0) : 0부터 0 전까지의 문자열 출력
 * 		3. contains() : 포함된 단어가 있으면 해당 문자열 출력
 * 		4. starts(ends)With : 앞(또는 뒤)부터 해당 문자가 있는지 확인
 * 		5. trim() : 좌우 끝의 공백 제거
 * 		6. equals() : 문자열 비교(대소문자 구분)
 * 		7. split() : 한 문자열 내의 구분문자를 이용하여 배열로 쪼갬
 * 		8. valueOf() : 모든 데이터형을 문자열로 변경
 * 		9. toLowerCase() : 소문자로 변환
 * 		10. toUpperCase() : 대문자로 변환
 */
import javax.swing.*;
import java.awt.event.*;

public class 문자열 extends JFrame implements ActionListener{
	JTextField tf = new JTextField();
	JTextField tf1 = new JTextField();
	
	public 문자열() {
		add("North", tf);
		add("South", tf1);
		//tf.setText(String.valueOf(20));
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this);
		
	}
	
	public static void main(String[] args)  {
		new 문자열();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) {
//			tf1.setText(tf.getText().toUpperCase());
			tf1.setText(tf.getText().toLowerCase());
		}
		
	}

}
