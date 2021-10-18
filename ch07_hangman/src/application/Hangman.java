package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);
	
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
	
	public void close() {
		//게임 종료, 스캐너 닫기
		scanner.close();
	}
	
	public void checkUserInput() {
		//유저가 단어 철자를 다 맞췄는지 체크해서 게임을 종료 running = false
		//게임종료 확인하는 메소드 isComp;eted 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " +word);
			running = false;
			
		}
		
	}
	
	
	public void getUserInput() {
		//유저에게 한 문자 입력 요구
		//입력받은 문자열에서 그 문자를 뽑아서 randomword 클래스에 전달 =>addguess(문자)
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
	}
	
		
	public void displayword() {
		//랜덤 단어 출력
		
		System.out.println(word.toString());
	}


}
