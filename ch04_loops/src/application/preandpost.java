package application;

public class preandpost {
	public static void main(String[] args) {
		//���������� ��ġ�� ���� ���� �����ϰ� �Ҵ�(=), ���� �Ҵ�(=)�ϰ� ����
		int cats=5;
		System.out.println(cats++);
		System.out.println(cats);
		
		int dogs = 3;
		System.out.println(++dogs);
		
		int chicken = 10;
		
		int animals = cats = chicken++;
		System.out.println(animals);
		
		int apples = 5;
		int bananas=4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);
	}

}
