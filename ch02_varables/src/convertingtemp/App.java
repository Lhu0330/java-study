package convertingtemp;

public class App {

	public static void main(String[] args) {
		// ����(celsius ���ÿ콺) -> ȭ��(fahrenheit�۷�����Ʈ) ��ȯ

		double celsius = 25;
		double fahrenheit = (celsius * 9/5) + 32;

		System.out.println("���� " + celsius + "�� ȭ��" + fahrenheit + "�̴�.");
	}

}
