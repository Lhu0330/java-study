package method;

public class Pork {

	public static void main(String[] args) {
		// 1¿Œ∫– 180g 1g¿∫ 5.179kcal 3¿Œ∫– ƒÆ∑Œ∏Æ 3*180*5.179
		int x = 3;
		double result = (Math.round(calKcal(x)*100))/100.0;
		System.out.println("ªÔ∞„ªÏ 3¿Œ∫– : " + result);

	}
	
	private static double calKcal(int x) {
		return x * 180 * 5.179;
	}

}
