import java.util.*;
public class ���ù�6_2 {

	public static void main(String[] args) {
		// ����
				int user = 0;
				int com = (int)(Math.random()*3);
			// �Է�
				Scanner scan = new Scanner(System.in);
				System.out.print("����(0) ����(1) ��(2) �� �ϳ��� �Է��ϼ��� : ");
				user = scan.nextInt();
				System.out.println("\n========================================\n");
			
				// 
				
			// �º� ���
				String[] str = {"����", "����", "��"};
				System.out.println("��ǻ�� : " + str[com] + "\n����: " + str[user]);
				
				switch(com - user) {
				case 2: case -1:
					System.out.println("�١ڡ١ڡ١� ���� Win! �١ڡ١ڡ١�");
					break;
				case 1: case -2:
					System.out.println("�١ڡ١ڡ١� ��ǻ�� Win! �١ڡ١ڡ١�");
					break;
				default:
					System.out.println("�١ڡ١ڡ١� Draw! �١ڡ١ڡ١�");
					break;
				}
					

	}

}
