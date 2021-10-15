package application;

public class Hangman {
	
	private boolean running = false;
	
	
	public void run() {
		//게임시작
		/*
		1.화면에 단어표시
		2.철자 입력
		3.철자가 맞는지 체크
		*/
		do {
			displayword(); //화면에 단어표시
			getUserInput(); //입력받음
			checkUserInput(); //맞는지 체크 다맞으면 running = false
			
		} while (running);
	}
	
	public void checkUserInput() {
		System.out.println("체크");
	}
	public void getUserInput() {
		System.out.println("단어맞추기");
	}
	public void displayword() {
		//랜덤 단어 출력
		
		Randomword word = new Randomword();
		System.out.println(word);
	}


}
