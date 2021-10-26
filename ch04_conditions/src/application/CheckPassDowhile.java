package application;

import java.util.Scanner;

public class CheckPassDowhile {

	public static void main(String[] args) {
		// 입력한 패스워드가 지정된 패스워드와 같은지 비교
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = null;
		
		do {
			System.out.print("Enter password >");
			password = scanner.nextLine();
		} while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");
			
		}
		else {
			System.out.println("접속 불가.");
		}

	}

}
