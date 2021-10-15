package application;

import java.util.Random;

/*랜덤 단어 만드는 사이트
 * http://randomwordgenerator.com
 * https://www.browserling.com/tools/newlines-to-spaces
 */
public class Randomword {
	private String books = "construction direction software connection security management suggestion development obligation operation shopping revolution judgment efficiency signature teaching independence difficulty promotion investment technology bathroom measurement database president reputation platform knowledge director literature indication assistant property boyfriend advertising hospital perception analysis inspector inflation contract criticism communication performance television introduction equipment preference employment membership";
	private String [] words = books.split(" ");
	
	private String selectword;
	
	public Randomword() {
		Random random = new Random();
		int randomIndex = random.nextInt(words.length);
		
		selectword = words[randomIndex]; //랜덤으로 단어를 선택
	}
	
	public String toString() {
		return selectword;
	}
	
	
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
}
