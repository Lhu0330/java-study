package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		//���ӽ���
		/*
		1.ȭ�鿡 �ܾ�ǥ��
		2.ö�� �Է�
		3.ö�ڰ� �´��� üũ
		*/
		
		do {
			displayword(); //ȭ�鿡 �ܾ�ǥ��
			getUserInput(); //�Է¹���
			checkUserInput(); //�´��� üũ �ٸ����� running = false
			
		} while (running);
	}
	
	
	public void checkUserInput() {
		System.out.println("üũ");
	}
	
	
	public void getUserInput() {
		//�������� �� ���� �Է� �䱸
		//�Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� randomword Ŭ������ ���� =>addguess(����)
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
	}
	
		
	public void displayword() {
		//���� �ܾ� ���
		
		System.out.println(word.toString());
	}


}
