package application;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// 입력을 받는 클래스 scanner 이용
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해 주세요 : ");
		double c = scanner.nextDouble();
		double f = (c*9/5)+32;
		
		System.out.println("섭씨 "+c+"는 화씨"+f+"이다.");

	}

}
