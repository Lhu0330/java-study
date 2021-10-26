package application;

import java.util.Scanner;

public class switch2 {
	public static void main(String[] args) {
		System.out.println("계속 진행하겠습니까? (y/n): ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		switch (input) {
		case "y":
			System.out.println("진행합니다...");
			break;
		case "n":
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
}
