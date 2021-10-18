package application;

import java.util.Random;

/*���� �ܾ� ����� ����Ʈ
 * http://randomwordgenerator.com
 * https://www.browserling.com/tools/newlines-to-spaces
 */
public class Randomword {
	private String books = "construction direction software connection security management suggestion development obligation operation shopping revolution judgment efficiency signature teaching independence difficulty promotion investment technology bathroom measurement database president reputation platform knowledge director literature indication assistant property boyfriend advertising hospital perception analysis inspector inflation contract criticism communication performance television introduction equipment preference employment membership";
	private String[] words = books.split(" ");

	
	private Random random = new Random();
	private String selectword = words[random.nextInt(words.length)];// �������� �ܾ ����
	private char[] characters; // ���� �迭 ���� ����

	public Randomword() {
		selectword = words[random.nextInt(words.length)];
		characters = new char[selectword.length()]; // ���� �迭 ���� ����
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
		//����ڰ� �Է��� �� ���ڸ� ���õ� �ܾ�� ������ �ִ��� Ȯ��
		//������ characters�� �ε��� ��ġ�� �Է�
		for(int i=0; i < selectword.length(); i++) {
			if(c == selectword.charAt(i)) {
				characters[i] = c;
			}
		}
	}

	public boolean isCompleted() {
		for(char c : characters) {
			if(c=='\u0000') {
				return false; //���� ���� ���ڰ� ����
			}
		}
		return true;
	}
}
