package game;

import java.util.Random;
import java.util.Scanner;

import game.object.*;

public class Game {
	public void run() {
		
		Gameobject[] objects = Gameobject.values();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("삼세판 게임 시작합니다.");
		int wins = 0;
		//유저의 선택
		for (int i = 1; i <=3 ; i++) {
		System.out.println("가위(0),바위(1),보(2) 중 숫자로 선택: ");
				
		int num1 = scanner.nextInt();
		int num2 = random.nextInt(objects.length);
		
		Gameobject ob1 = objects[num1];
		Gameobject ob2 = objects[num2];
		
		System.out.println("당신의 선택은 : " + ob1);
		System.out.println("컴퓨터의 선택은 : " + ob2);
		
		int score = ob1.compareto(ob2);
		wins += score;
		}
		if (wins > 0 ) {
			System.out.println("당신의 승리!");		
		}
		if (wins < 0 ) {
			System.out.println("당신의 패배!");
		}
		else {
			System.out.println("비겼습니다!");
		
		}
		scanner.close();
		
	}

}
