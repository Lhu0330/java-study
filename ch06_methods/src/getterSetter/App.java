package getterSetter;

public class App {

	public static void main(String[] args) {
		// ���������� private�� ���� Ŭ���������� ���ٰ��� �ν��ͽ������� ���� ������ �Ǹ� �ȵ�
		Person p1 = new Person();
//		p1.name = "���";
		p1.setName("���");
		p1.setAge(7);
		
//		p1.name="�浿";
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
