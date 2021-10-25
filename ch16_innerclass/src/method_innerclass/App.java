package method_innerclass;

public class App {
	
	private String name;
	
	public App() {
		name = "앨리자베스";
	}
	
	public String getName() {
		return name;
	}
	
	public void run() {
//		System.out.println(name);//이름을 출력
		class Printer {
			public void print() {
				System.out.println(name);
				//내부 클래스에서 상위클래스의 변수 사용가능
			}
		}
		//Printer p = new Printer();
		//p.print();
		new Printer().print();
	}
	
	public static void main(String[] args) {
//		메소드 안의 클래스
		App app = new App();
		app.run();
		

	}

}
