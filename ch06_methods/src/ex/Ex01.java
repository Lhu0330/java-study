package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ĺ� �� ���ڸ� �Է��ϼ���>> ");
		String I = scanner.nextLine();
		scanner.close();
		
		for(char i = 'a' ; i <= I.charAt(0); i++) {
			System.out.println(i);
		}
	}

}
