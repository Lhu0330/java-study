package application;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ���� scanner �̿�
		Scanner scanner = new Scanner(System.in);
		System.out.print("�µ��� �Է��� �ּ��� : ");
		double c = scanner.nextDouble();
		double f = (c*9/5)+32;
		
		System.out.println("���� "+c+"�� ȭ��"+f+"�̴�.");

	}

}
