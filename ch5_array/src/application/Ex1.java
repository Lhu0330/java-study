package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int NLM = 3; // 배열의 크기

		int[] numbers = new int[NLM];

		for (int i = 0; i < NLM; i++) {
			System.out.println("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("입력한 값은: ");

		int total = 0;
		for (int i = 0; i < NLM; i++) {
			System.out.println(numbers[i]);

			total += numbers[i];
		}

		System.out.println("Total: " + total);

	}

}
