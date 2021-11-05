package example;

@FunctionalInterface
interface Greeter {
	void greet();
}

public class App2 {
	
	public static void main(String[] args) {
		
		Greeter g = App2::sayHello;
		
		g.greet();
		
		
		
	}
	
	private static void sayHello() {
		System.out.println("헬로우~~");
	}
}

