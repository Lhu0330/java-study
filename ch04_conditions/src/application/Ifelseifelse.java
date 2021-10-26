package application;

import java.util.Scanner;

public class Ifelseifelse {

	public static void main(String[] args) {
		// if문
		Scanner scanner = new Scanner(System.in); // 스캐너 생성

		System.out.println("사과의 갯수는 ? ");

		int apples = scanner.nextInt();

		System.out.println("바나나의 갯수는 ? ");
		int bananas = scanner.nextInt();

		if (apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		} 
		else if(apples < bananas)  { // if문의 조건이 false일때 실행
			System.out.println("바나나가 사과보다 많음");
		}
		else {
			System.out.println("바나나와 사과가 같음");
		}
		System.out.println("프로그램 종료.");

	}

}
