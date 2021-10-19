package this_constructor;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("�͸�", 0);
	}

	public Person(String name) {
		this(name, 0);
	}
	
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[�̸� =" + name + ", ���� = " + age + "]";
	}
}
