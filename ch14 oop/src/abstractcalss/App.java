package abstractcalss;

public class App {

	public static void main(String[] args) {

		Gameobject[] objs = { new Player(), new Monster() };
		
		for(Gameobject obj : objs) {
			System.out.println(obj);
			obj.describe();
		}

	}

}
