package method;

public class Elevator {
	public static String  guide(int a) {
		String b;
		if (a<11) {
			b = "����";
		}
		else {
			b = "����";
		}
		return b;
		
	}

	public static void main(String[] args) {
		int a = 13;
		int b = 7;
		int c = 10;
		
		System.out.printf("%d�� -> %s ��������Ʈ\n", a, guide(a));
		System.out.printf("%d�� -> %s ��������Ʈ\n", b, guide(b));
		System.out.printf("%d�� -> %s ��������Ʈ\n", c, guide(c));
	}


}
