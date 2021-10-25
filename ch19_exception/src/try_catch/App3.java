package try_catch;

import java.util.Scanner;

public class App3 {
	
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		// try catch문을 사용해 예외처리
		
		
		int number = getNumber();
		System.out.println("입력한 숫자는: " + number);
		scanner.close();
				
	}
	
	private static int getNumber() {
		int number = 0;
		boolean isNumber = false;
		
		do {
			System.out.println("숫자를 입력: ");
			String line = scanner.nextLine();
			
			try {
				number = Integer.parseInt(line);
				isNumber = true;
			} catch(NumberFormatException e) {
				System.out.println("숫자입력이 아닙니다.");
			}
		} while(!isNumber);
		
		return number;
	}
	
	

}
