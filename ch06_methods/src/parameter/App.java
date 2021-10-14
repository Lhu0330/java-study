package parameter;

public class App {

	public static void main(String[] args) {
		// 칼큘레이터 객체를 만든후 그 메소드를 square를 매개변수를 입력하여 사용
		Calculator calc = new Calculator();
		int number = 5;
		int result = calc.square(number);
		System.out.printf("%d의 제곱은 %d이다.\n", number, result);
		
		result = calc.plus(10,10);
		System.out.printf("두수의 합은 %d이다.\n", result);
		
		result = calc.minus(10,10);
		System.out.printf("두수의 합은 %d이다.\n", result);

	}

}
