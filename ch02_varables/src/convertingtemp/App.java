package convertingtemp;

public class App {

	public static void main(String[] args) {
		// 섭씨(celsius 셀시우스) -> 화씨(fahrenheit퍼렌하이트) 변환

		double celsius = 25;
		double fahrenheit = (celsius * 9/5) + 32;

		System.out.println("섭씨 " + celsius + "는 화씨" + fahrenheit + "이다.");
	}

}
