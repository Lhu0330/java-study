package application;

import java.util.Random;

/*랜덤 단어 만드는 사이트
 * http://randomwordgenerator.com
 * https://www.browserling.com/tools/newlines-to-spaces
 */
public class Randomword {
	private String books = "construction direction software connection security management suggestion development obligation operation shopping revolution judgment efficiency signature teaching independence difficulty promotion investment technology bathroom measurement database president reputation platform knowledge director literature indication assistant property boyfriend advertising hospital perception analysis inspector inflation contract criticism communication performance television introduction equipment preference employment membership";
	private String[] words = books.split(" ");

	
	private Random random = new Random();
	private String selectword = words[random.nextInt(words.length)];// 랜덤으로 단어를 선택
	private char[] characters; // 문자 배열 공간 생성

	public Randomword() {
		selectword = words[random.nextInt(words.length)];
		characters = new char[selectword.length()]; // 문자 배열 공간 생성
	}

	public String toString() {

//		String text = "";
//		characters[3] = 'x';
		
		StringBuilder sb = new StringBuilder();

		for (char c : characters) {
			sb.append(c== '\u0000'? '_' : c);
			sb.append(' ');
		}


		return sb.toString();
	}

	public void getWords() {
		for (String w : words) {
			System.out.println(w);
		}
	}
	
	public void addGuess(char c) {
		//사용자가 입력한 한 무자를 선택된 단어에서 같은게 있는지 확인
		//있으면 characters의 인덱스 위치에 입력
		for(int i=0; i < selectword.length(); i++) {
			if(c == selectword.charAt(i)) {
				characters[i] = c;
			}
		}
	}

	public boolean isCompleted() {
		for(char c : characters) {
			if(c=='\u0000') {
				return false; //아직 맞출 문자가 있음
			}
		}
		return true;
	}
}
