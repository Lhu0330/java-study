package application;

public class Break {

	public static void main(String[] args) {
		// break �ݺ��� �ȿ��� ���� �ݺ����� ��������
		int count = 1;

		while (true) {
			System.out.println("��ο�." + count);

			if (count++ == 5) {
				break;
			}
			
			System.out.println("How are you.");
			count ++;
		}
		
		System.out.println("Program finished");
	}
}
