package application;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Randomword word = new Randomword();
		
		System.out.println(word.toString());
//		
//		Random random = new Random();
//		String[] words = { "���", "�����", "���̾�","����","��"};
//		
//			
//		for(int i=0; i<100; i++) {
//			int randomIndex = random.nextInt(words.length); //�迭�� ũ�⸸ŭ �������� ����
//			System.out.println(words[randomIndex]);
//		}
		
		Randomword words = new Randomword();
		System.out.println(words);
	}
		

}
