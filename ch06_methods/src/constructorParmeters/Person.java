package constructorParmeters;

public class Person {
	//����
	private String name;
	private double height;
	
	//������
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		// �⺻ ������(�Ű����� ����)�� ��������
		System.out.println("�� ����� ����!");
	}
	
	//get set �޼ҵ�
	public void setName(String name) {
		this.name = name; 
	}

	public String getName() {
		return name;
	}
	public void setHeight(double height) {
		this.height = height; 
	}
	
	public double getHeight() {
		return height;
	}
	
	public String toString() {
		String text = "�̸�: " + name + " Ű: "+height;
		return text;
	}

}
