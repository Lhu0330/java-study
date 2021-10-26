package application;

public class StringEquals {

	public static void main(String[] args) {
		
		String text1 = "apples";
		String text2 = "orange";
		
		System.out.printf("두개의 문자열 일치 : %b\n", text1==text2);
		System.out.println("두개의 문자열 일치 : " + text1.equals(text2));

	}

}
