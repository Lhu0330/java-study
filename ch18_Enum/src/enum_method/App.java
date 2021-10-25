package enum_method;

public class App {

	public static void main(String[] args) {
		// values()메소드 해당 enum의 모든 상수를 저장한 배열을 리턴
		Fruit[] fruits = Fruit.values();
		
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		//ordinal 메소든느 상수의 순서를 리턴
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
	}

}
