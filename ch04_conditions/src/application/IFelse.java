package application;

import java.util.Scanner;

public class IFelse {

	public static void main(String[] args) {
		// if��
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����
		
		System.out.println("����� ������ ? ");
		
		int apples = scanner.nextInt();
		
		System.out.println("�ٳ����� ������ ? ");
		int bananas = scanner.nextInt();
		
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}
		else { //if���� ������ false�϶� ����
			System.out.println("�ٳ����� ������� ���ų� ����");
		}
		
		System.out.println("���α׷� ����.");

	}

}
