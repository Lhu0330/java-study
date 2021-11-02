package equlas;

class Person {
	private String name; 
	
	@Override
	public boolean equals(Object other) {
		//object클랫의 equals 오버라이드해서 person클래스의 이름으로 비교하도록 수정
		String a = "abc";
		String b = "bdef";
		a.equals(b);
		
		if(other == null) return false;
		if(other == this) return true;
		if(!(other instanceof Person)) return false;
		if(this.name == null) return false;
		Person p = (Person)other;
		if(p.name == null) return false;
		
		return this.equals(p.name);
		
	}

	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));//ㄴ
	}

}
