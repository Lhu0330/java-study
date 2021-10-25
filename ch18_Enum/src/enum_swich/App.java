package enum_swich;

public class App {

	public static void main(String[] args) {
		Fruit f1 = Fruit.ORANGE;
		
		switch(f1) {
		case ORANGE:
			System.out.println("오렌지");
			break;
		case BANANA:
			System.out.println("오렌지");
			break;
		case APPLE:
			System.out.println("오렌지");
			break;
		default:
			System.out.println("없는 과일입니다.");
			break;
		}

	}

}
