package application;

public class Hangman {
	
	private boolean running = false;
	
	
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
		System.out.println("�ܾ���߱�");
	}
	public void displayword() {
		//���� �ܾ� ���
		
		Randomword word = new Randomword();
		System.out.println(word);
	}


}
