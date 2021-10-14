package getterSetter;

public class App {

	public static void main(String[] args) {
		// 접근제어자 private는 같은 클래스에서만 접근가능 인스터스변수에 직접 접근이 되면 안됨
		Person p1 = new Person();
//		p1.name = "펭수";
		p1.setName("펭수");
		p1.setAge(7);
		
//		p1.name="길동";
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
