package numbering;

public class App {

	public static void main(String[] args) {
		// decimal 10진수
		// binary 2진수(컴퓨터)
		// hexadecimal 16진수
		
		int value = 123;
		
		System.out.println(Integer.toBinaryString(value));
		System.out.println(Integer.toHexString(123));
		
		int value255 = 0xFF; //0x는 16진수 0b는 2진수를 의미
		
		System.out.println(value255);
		
		System.out.println(Integer.toBinaryString(value255));
		System.out.printf("%s", Integer.toHexString(value255));

	}

}
