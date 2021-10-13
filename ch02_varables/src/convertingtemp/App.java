package convertingtemp;

public class App {

	public static void main(String[] args) {
		// ¼·¾¾(celsius ¼¿½Ã¿ì½º) -> È­¾¾(fahrenheitÆÛ·»ÇÏÀÌÆ®) º¯È¯

		double celsius = 25;
		double fahrenheit = (celsius * 9/5) + 32;

		System.out.println("¼·¾¾ " + celsius + "´Â È­¾¾" + fahrenheit + "ÀÌ´Ù.");
	}

}
