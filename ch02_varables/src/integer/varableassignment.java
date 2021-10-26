package integer;

public class varableassignment {

	public static void main(String[] args) {
		// 변수는 항상 재할당(값을 새로 입력가능) 할수 있다.
		int dogs = 8;
		int cats = 3;

		System.out.println("1. dogs: " + dogs);
		System.out.println("1. cats: " + cats);

		dogs = cats;
		cats = 10;

		System.out.println("1. dogs: " + dogs);
		System.out.println("1. cats: " + cats);

	}

}
