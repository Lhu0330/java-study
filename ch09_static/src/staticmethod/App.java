package staticmethod;

public class App {
	
	private static int add(int a, int b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		// 스테틱 메소드 getCount 사용
		final String CAT_COUNT = "고양이 숫자: %d\n";
		
		Cat cat1 = new Cat("마틸다");
		Cat cat2 = new Cat("라이언");
		Cat cat3 = new Cat("울버린");
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());
		
		//string.format은 printf를 문자열로 표현 리턴
		String catCount = String.format(CAT_COUNT, Cat.getCount());
		System.out.println(catCount);

		
		int x = add(1,1);
		System.out.println(x);

	}

}
