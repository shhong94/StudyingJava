/*
 * 	�� �⺻�� 
 * 		����, �Ǽ�, ��...
 * 	�� ������
 * 		�迭, Ŭ����...
 * 		���� ������Ҵ� �ٸ����� �ְ�, ������ �ּ�
 * 
 * 	�� ���ڿ� ���� �޼ҵ��� �ֿ� ���
 * 		1. length() : ���� ���� ���
 * 		2. substring(0, 0) : 0���� 0 �������� ���ڿ� ���
 * 		3. contains() : ���Ե� �ܾ ������ �ش� ���ڿ� ���
 * 		4. starts(ends)With : ��(�Ǵ� ��)���� �ش� ���ڰ� �ִ��� Ȯ��
 * 		5. trim() : �¿� ���� ���� ����
 * 		6. equals() : ���ڿ� ��(��ҹ��� ����)
 * 		7. split() : �� ���ڿ� ���� ���й��ڸ� �̿��Ͽ� �迭�� �ɰ�
 * 		8. valueOf() : ��� ���������� ���ڿ��� ����
 * 		9. toLowerCase() : �ҹ��ڷ� ��ȯ
 * 		10. toUpperCase() : �빮�ڷ� ��ȯ
 */
import javax.swing.*;
import java.awt.event.*;

public class ���ڿ� extends JFrame implements ActionListener{
	JTextField tf = new JTextField();
	JTextField tf1 = new JTextField();
	
	public ���ڿ�() {
		add("North", tf);
		add("South", tf1);
		//tf.setText(String.valueOf(20));
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this);
		
	}
	
	public static void main(String[] args)  {
		new ���ڿ�();

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
