package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알파벳 한 문자를 입력하세요>> ");
		String I = scanner.nextLine();
		scanner.close();
		
		for(char i = 'a' ; i <= I.charAt(0); i++) {
			System.out.println(i);
		}
	}

}
