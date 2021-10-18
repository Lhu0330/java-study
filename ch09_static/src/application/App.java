package application;

public class App {

	public static void main(String[] args) {
		// 고양이 클래스 불러오기
		Cat cat1 = new Cat("마틸다");
		Cat cat2 = new Cat("라이언");
		Cat cat3 = new Cat("울버린");
		
		System.out.println(cat1);
		System.out.println(cat2.toString());
		
		//스테틱 변수는 객체와 상관없이 클래스명.변수로 사용한다 객체 생성할 필요가 없다
		System.out.println(Cat.FOOD);
		System.out.println(Cat.getCount());
	}	

}
