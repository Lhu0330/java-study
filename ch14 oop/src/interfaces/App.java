package interfaces;

public class App {

	public static void main(String[] args) {
		
		Describable[] objs = {new Person(), new Computer() }; //모든 객체는 오브젝트 클래스를 상속받음
		
		for (Describable obj : objs) {
			System.out.println(obj.getDescription());
		}

	}

}
