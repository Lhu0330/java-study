package getterSetter;

public class Person {
	//클래스 안에 만든 변수를 인스턴스 변수 => 객체 생성시 생성됨
	private String name;
	private int age;
	//get, set 메소드로 인스턴스 변수에 접근
	public void setName(String name) {
		this.name = name; // this는 인스턴스
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() { 
		return age;
	}

}
