package try_catch;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		// try catch���� ����� ����ó��

		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� �Է�: ");
		String line = scanner.nextLine();

		int number = 0;
		boolean isNumber = false;
		try {
			number = Integer.parseInt(line);
			isNumber = true;
		} catch (NumberFormatException e) {
			System.out.println("�����Է��� �ƴմϴ�.");
		}
		if(isNumber) {

		System.out.println("�Է��� ���ڴ�: " + number);
		
		}
		
		scanner.close();
	}

}
