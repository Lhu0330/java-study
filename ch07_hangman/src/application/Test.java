package application;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Randomword word = new Randomword();
		
		System.out.println(word.toString());
//		
//		Random random = new Random();
//		String[] words = { "펭수", "고양이", "라이언","늑대","소"};
//		
//			
//		for(int i=0; i<100; i++) {
//			int randomIndex = random.nextInt(words.length); //배열의 크기만큼 랜덤숫자 생성
//			System.out.println(words[randomIndex]);
//		}
		
		Randomword words = new Randomword();
		System.out.println(words);
	}
		

}
