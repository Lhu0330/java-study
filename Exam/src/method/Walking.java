package method;

public class Walking {

	public static void main(String[] args) {
		// ������*0.02=Į�θ� �Ҹ�
		int walk = 5000;
		double result = calculateCalory(walk);
		System.out.println("�Ҹ� Į�θ�: " + result);
	}
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
}
