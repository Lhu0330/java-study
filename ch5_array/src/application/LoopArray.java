package application;

public class LoopArray {

	public static void main(String[] args) {
		// for �ݺ����� ���ڿ��� �ε��� i�� �̿��� ���ڿ��� ù������� ������ ����϶�
		String[] animals = {"��", "�����", "��", "����", "��"};
		
		/*�ݺ������� ��ü
		 * System.out.println(animals[0]);
		 * System.out.println(animals[1]);
		 * System.out.println(animals[2]);
		 */
		
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println(animals.length);

	}

}
