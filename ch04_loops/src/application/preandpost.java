package application;

public class preandpost {
	public static void main(String[] args) {
		//증감연사자 위치에 따라 먼저 증감하고 할당(=), 먼저 할당(=)하고 증가
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
