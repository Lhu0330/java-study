package application;

import java.util.Scanner;

public class CheckPassDowhile {

	public static void main(String[] args) {
		// �Է��� �н����尡 ������ �н������ ������ ��
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = null;
		
		do {
			System.out.print("Enter password >");
			password = scanner.nextLine();
		} while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("���� ����.");
			
		}
		else {
			System.out.println("���� �Ұ�.");
		}

	}

}