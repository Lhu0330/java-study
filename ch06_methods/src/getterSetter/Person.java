package getterSetter;

public class Person {
	//Ŭ���� �ȿ� ���� ������ �ν��Ͻ� ���� => ��ü ������ ������
	private String name;
	private int age;
	//get, set �޼ҵ�� �ν��Ͻ� ������ ����
	public void setName(String name) {
		this.name = name; // this�� �ν��Ͻ�
	}
	public void setAge(int age) {
		this.age = age;
		//this�� ���� Ŭ������ ��ü�� ����Ŵ
	}
	public String getName() {
		return name;
	}
	public int getAge() { 
		return age;
	}

}
