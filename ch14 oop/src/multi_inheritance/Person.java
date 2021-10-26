package multi_inheritance;

public class Person implements Speaker, Greeter {

	@Override
	public void greet() {
		System.out.println("환영합니다.");
		
	}

	@Override
	public void speak() {
		System.out.println("나는 Person 입니다.");
		
	}

}
