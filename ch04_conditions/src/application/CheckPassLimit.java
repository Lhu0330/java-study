package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// �н����尡 Ʋ������ 3�� �Է��� �� �ִ� ��ȸ�� �ش�.
		// �н����尡 ������ '���ӽ���'����ϰ� �ݺ����� ��������
		// �н����尡 3ȸ Ʋ���� '���Ӱź�'
		
		final String USER_PASSWOR = "hello";
		
		Scanner scanner = new Scanner(System.in);
		boolean accessOK = false; // �÷���(flag):�Ҹ������� ���¿� ���� ó���帧����
		
		for (int i = 0; i<3; i++) {
			System.out.println("Enter password >");
			String password = scanner.nextLine();
			
			if (password.equals(USER_PASSWOR)) {
				accessOK = true;
				break;
			}
			else { 
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
			}
		}
		
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("���Ӱź�");
		}
		else {
			System.out.println("���ӽ���");
		}

	}

}
