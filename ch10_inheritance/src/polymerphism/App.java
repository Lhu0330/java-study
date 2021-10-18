package polymerphism;

public class App {

	public static void main(String[] args) {
		
//		Cat cat1 = new Housecat();
//		cat1.vocal();
//		cat1.hunt();
//		
//		Cat cat2 = new Roadcat();
//		cat2.vocal();
//		cat2.hunt();
//		
//		Cat cat3 = new Tiger();
//		cat3.vocal();
//		cat3.hunt();
//		
		Cat[] cats = { new Housecat(), new Roadcat(), new Tiger() };
//		cats[0].vocal();
//		cats[0].hunt();
//		
//		cats[1].vocal();
//		cats[1].hunt();
//		
//		cats[2].vocal();
//		cats[2].hunt();
		
		for (int i = 0 ; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}

		//형변환 casting
		//기본타입
		//int a =1.2345;
		int b =(int)1.2345;
		System.out.println(b);
		
		//참조타입: 기본을 제외한 클래스 타입 등
		Cat cat1 = new Housecat(); //업캐스팅
		
		Housecat cat2 = (Housecat)cat1; // 다운캐스팅(하위클래스로 변환)
		
	}

}
