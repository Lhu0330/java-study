package constructorParmeters;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("펭수", 120.0);
		Person p2 = new Person("길동", 172.5);
		Person p3 = new Person("라이언", 165.5);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
	}
	

}
