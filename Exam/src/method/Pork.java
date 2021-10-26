package method;

public class Pork {

	public static void main(String[] args) {
		// 1인분 180g 1g은 5.179kcal 3인분 칼로리 3*180*5.179
		int x = 3;
		double result = (Math.round(calKcal(x)*100))/100.0;
		System.out.println("삼겹살 3인분 : " + result);

	}
	
	private static double calKcal(int x) {
		return x * 180 * 5.179;
	}

}
