package method;

public class Elevator {
	public static String  guide(int a) {
		String b;
		if (a<11) {
			b = "저층";
		}
		else {
			b = "고층";
		}
		return b;
		
	}

	public static void main(String[] args) {
		int a = 13;
		int b = 7;
		int c = 10;
		
		System.out.printf("%d층 -> %s 엘리베이트\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘리베이트\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘리베이트\n", c, guide(c));
	}


}
