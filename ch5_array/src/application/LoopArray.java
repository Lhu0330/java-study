package application;

public class LoopArray {

	public static void main(String[] args) {
		// for 반복문과 문자열의 인덱스 i를 이용해 문자열의 첫번재부터 끝까지 출력하라
		String[] animals = {"개", "고양이", "닭", "사자", "양"};
		
		/*반복문으로 대체
		 * System.out.println(animals[0]);
		 * System.out.println(animals[1]);
		 * System.out.println(animals[2]);
		 */
		
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println(animals.length);

	}

}
