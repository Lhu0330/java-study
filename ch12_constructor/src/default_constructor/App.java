package default_constructor;

public class App {

	public static void main(String[] args) {
		Person person = new Person("ȫ�浿");
		System.out.println(person);
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("���");
		System.out.println(p2);
		Person p3 = new Person("���̾�", 27);
		System.out.println(p3);

	}

}
