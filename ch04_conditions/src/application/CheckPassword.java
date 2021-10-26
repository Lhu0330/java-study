package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 입력한 패스워드가 지정된 패스워드와 같은지 비교
		final String USER_PASSWORD = "hello";
		
		System.out.print("Enter password > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");
			
		}
		else {
			System.out.println("접속 불가.");
		}

	}

}
