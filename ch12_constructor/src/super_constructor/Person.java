package super_constructor;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		System.out.println("Person ������!");
		this.name= name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
	
	
}
