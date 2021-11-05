package lambda_paratmeter2;

interface Runner {
	void execute(String name, String text);
}

public class App {

	public static void main(String[] args) {
		// 파라메터(매개변수)가 있는 추상메소드
		Runner run1 = (n,t) -> System.out.printf("%s님 %s \n", n, t);
		Runner run2 = (n,t) -> System.out.printf("%s님 %s \n", t, n);
	
		run1.execute("펭수", "안녕하세요");
		run2.execute("펭수", "안녕하세요");
		
		greet(run1);
		greet(run2);
		
	}
	
	private static void greet(Runner run) {
		run.execute("길동",  "안녕하세요");
	}
	
}
