package game;

import java.util.Random;
import java.util.Scanner;

import game.object.*;

public class Game {
	public void run() {
		
		Gameobject[] objects = { new Scissors(), new Rock(), new Paper() };
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�＼�� ���� �����մϴ�.");
		int wins = 0;
		//������ ����
		for (int i = 1; i <=3 ; i++) {
		System.out.println("����(0),����(1),��(2) �� ���ڷ� ����: ");
				
		int num1 = scanner.nextInt();
		int num2 = random.nextInt(objects.length);
		
		Gameobject ob1 = objects[num1];
		Gameobject ob2 = objects[num2];
		
		System.out.println("����� ������ : " + ob1.getName());
		System.out.println("��ǻ���� ������ : " + ob2.getName());
		
		int score = ob1.compareto(ob2);
		wins += score;
		}
		if (wins > 0 ) {
			System.out.println("����� �¸�!");		
		}
		if (wins < 0 ) {
			System.out.println("����� �й�!");
		}
		else {
			System.out.println("�����ϴ�!");
		
		}
		scanner.close();
		
	}

}
