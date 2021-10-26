package exception;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("하나");
		Thread.sleep(2000); //2초동안 프로그램 정지
		System.out.println("둘");
	}
}
