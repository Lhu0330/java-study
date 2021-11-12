package application_console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Abilitystone {

	static Probability p = new Probability();
	private static boolean running = true;
	static Scanner s = new Scanner(System.in);
	
	public static void run() {

		do {
			display();
			inputUserselect();
			check();
		} while (running);

	}

	public static void end() {
		s.close();
	}

	private static void check() {
		
		if (p.c1 == 10 && p.c2 == 10 && p.c3 == 10) {
			running = false;
			p.display();
			
			boolean run = true;
			do {
				System.out.println("다시하시겠습니까? (y/n)");

				String y = s.nextLine();
				if (y.equals("y")) {
					System.out.println("다시시작합니다.");
					running = true;
					run = false;
					p.clear();
				}

				else if (y.equals("n")) {
					System.out.println("게임을 종료합니다.");
					run = false;

				} else {
					System.out.println("다시 입력해주세요");
					
				}
			} while (run);
		}

	}

	private static void display() {
		p.display();

	}

	private static void inputUserselect() {
		System.out.println("선택하세요(도움말을 보시려면 0을 입력해주세요) : ");
	
		try {
			int n = s.nextInt();
			s.nextLine();
			
			if (n == 1) {
				if (p.c1 == 10) {
					System.out.println("이줄은 세공이 끝났습니다. 다른 곳을 선택해주세요");
					System.out.println();
				} else {
					p.q1();
				}
			} else if (n == 2) {
				if (p.c2 == 10) {
					System.out.println("이줄은 세공이 끝났습니다. 다른 곳을 선택해주세요");
					System.out.println();
				} else {
					p.q2();
				}
			} else if (n == 3) {
				if (p.c3 == 10) {
					System.out.println("이줄은 세공이 끝났습니다. 다른 곳을 선택해주세요");
					System.out.println();
				} else {
					p.q3();
				}
			} else if (n == 0) {
				System.out.println("어빌리티 스톤은 1, 2줄은 최대한 많이 성공해야되고 3은 최대한 적게 성공해야됩니다. 당신의 운을 시험해보세요 ");
				System.out.println();
			} else {
				System.out.println("다시 입력해주세요 1, 2, 3, 0만 가능합니다.");
				
			}

		} catch (InputMismatchException e) {
			s= new Scanner(System.in);
			System.out.println("숫자만 입력하세요");
			
		}
		System.out.println("-------------------------");
		

	}

}
