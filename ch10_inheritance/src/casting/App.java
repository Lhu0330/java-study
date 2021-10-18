package casting;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new Housecat();
		cat1.vocal();
		cat1.hunt();
		
		//cat1.call();
		//cat 타입이기 때문에 고양이 메소드만 사용가능(오버라이딩 됨)
		
		Housecat cat2 = (Housecat)cat1;
		cat2.call();
		
	}

}
