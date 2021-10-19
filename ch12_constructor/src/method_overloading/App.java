package method_overloading;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.greet();
		person.greet("Æë¼ö");
		person.greet(190);
		person.greet(190,"Æë¼ö");
	
	}

}
