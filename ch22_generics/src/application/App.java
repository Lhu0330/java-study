package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {
		Wrapper<Cat> wrapper = new Wrapper<>();
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다");
		Creature creature = new Creature("생물");
		
		wrapper.set(cat);
		wrapper2.set(creature);
		
		Cat retrieved = (Cat)wrapper.get();
		Creature r2 = wrapper2.get();
		
	
		System.out.println(retrieved);
		System.out.println(r2);
	}

}
