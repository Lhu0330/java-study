package method;

public class Diet {

	public static double calculate(double weight, double tall) {
		double bmi = weight / (tall*tall);
		return bmi;
	}
	
	public static String result(double bmi) {
		String result = "";
		if (bmi >= 30)
			result = "비만";
		else if (bmi >= 25)
			result = "과체중";
		else if (bmi >= 18.5)
			result = "정상";
		else
			result = "저체중";
		return result;
	}
	
	
	public static void main(String[] args) {
		double w = 81.6;
		double t = 1.76;
		
		double bmi = calculate(w,t);
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
		System.out.printf("결과: %s입니다.\n", result(bmi));
		

	}

}
