package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인'출력하고 반복문을 빠져나옴
		// 패스워드가 3회 틀릴시 '접속거부'
		
		final String USER_PASSWOR = "hello";
		
		Scanner scanner = new Scanner(System.in);
		boolean accessOK = false; // 플래그(flag):불린벼수로 상태에 따라 처리흐름제어
		
		for (int i = 0; i<3; i++) {
			System.out.println("Enter password >");
			String password = scanner.nextLine();
			
			if (password.equals(USER_PASSWOR)) {
				accessOK = true;
				break;
			}
			else { 
				System.out.println("비번이 틀렸습니다.");
			}
		}
		
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속거부");
		}
		else {
			System.out.println("접속승인");
		}

	}

}
