package enum_swich;

public class App {

	public static void main(String[] args) {
		Fruit f1 = Fruit.ORANGE;
		
		switch(f1) {
		case ORANGE:
			System.out.println("������");
			break;
		case BANANA:
			System.out.println("������");
			break;
		case APPLE:
			System.out.println("������");
			break;
		default:
			System.out.println("���� �����Դϴ�.");
			break;
		}

	}

}
