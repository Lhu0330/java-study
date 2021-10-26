package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// try catch문을 사용해 예외처리

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력: ");
		String line = scanner.nextLine();

		int number = 0;
		boolean isNumber = false;
		try {
			number = Integer.parseInt(line);
			isNumber = true;
		} catch (NumberFormatException e) {
			System.out.println("숫자입력이 아닙니다.");
		}
		if(isNumber) {

		System.out.println("입력한 숫자는: " + number);
		
		}
		
		scanner.close();
	}

}
