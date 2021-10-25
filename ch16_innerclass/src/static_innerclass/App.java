package static_innerclass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();
		Person.Head head = p1.new Head();
		head.print();
		Person.Body body = new Person.Body();
		body.print();

	}

}
