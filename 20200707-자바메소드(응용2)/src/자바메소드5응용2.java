/*
 *  
 */


public class �ڹٸ޼ҵ�5����2 {
	
	static String[] title = {
			"#����ִ�",
			"���",
			"�¿���: �� �Ϸ��� ����",
			"�Ҹ���",
			"�κ����� 2020",
			"��ũ ����Ʈ",
			"������ ���",
			"Ʈ���� ���ͽ� ��",
			"�߱��ҳ�",
			"�ƹ�ư, �ƴ�",
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
			"a"
			};
	
	static void titleMax() {
		int max = 0;
		for(int i = 0; i < title.length; i++) {
			if(max < title[i].length()) {
				max = title[i].length();
			}
		}
		for(int i = 0; i < title.length; i++) {
			if(max == title[i].length()) {
				System.out.println(title[i]);
			}
		}
	}
	
	static void titleMin() {
		int min = 100;
		for(int i = 0; i < title.length; i++) {
			if(min > title[i].length()) {
				min = title[i].length();
			}
		}
		for(int i = 0; i < title.length; i++) {
			if(min == title[i].length()) {
				System.out.println(title[i]);
			}
		}
	}
	
	static void process() {
		System.out.print("���� �� ��ȭ�� : ");
		titleMax();
		System.out.print("���� ª�� ��ȭ�� : ");
		titleMin();
	}
	public static void main(String[] args) throws Exception{
		process();

	}

}
