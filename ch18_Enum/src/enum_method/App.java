package enum_method;

public class App {

	public static void main(String[] args) {
		// values()�޼ҵ� �ش� enum�� ��� ����� ������ �迭�� ����
		Fruit[] fruits = Fruit.values();
		
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		//ordinal �޼ҵ�� ����� ������ ����
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
	}

}
