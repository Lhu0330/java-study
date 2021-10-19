package default_constructor;

public class App {

	public static void main(String[] args) {
		Person person = new Person("È«±æµ¿");
		System.out.println(person);
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("Æë¼ö");
		System.out.println(p2);
		Person p3 = new Person("¶óÀÌ¾ð", 27);
		System.out.println(p3);

	}

}
