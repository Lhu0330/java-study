package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int NLM = 3; // �迭�� ũ��

		int[] numbers = new int[NLM];

		for (int i = 0; i < NLM; i++) {
			System.out.println("���ڸ� �Է�: ");
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("�Է��� ����: ");

		int total = 0;
		for (int i = 0; i < NLM; i++) {
			System.out.println(numbers[i]);

			total += numbers[i];
		}

		System.out.println("Total: " + total);

	}

}
