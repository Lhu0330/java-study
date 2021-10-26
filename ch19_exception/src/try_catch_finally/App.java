package try_catch_finally;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		
		try {
			p1.setName("이름");
			System.out.println("여기는 실행안됨");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//무조건 실행되는 곳
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
