package method;

public class Newline {

	public static void main(String[] args) {
		System.out.println("line1");
		threeLines();
		System.out.println("line2");

	}
	
	public static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
		
	}
	
	private static void oneLine() {
		System.out.println(); //한줄 뛰움
	}
}
