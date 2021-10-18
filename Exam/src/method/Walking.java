package method;

public class Walking {

	public static void main(String[] args) {
		// 걸음수*0.02=칼로리 소모량
		int walk = 5000;
		double result = calculateCalory(walk);
		System.out.println("소모 칼로리: " + result);
	}
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
}
