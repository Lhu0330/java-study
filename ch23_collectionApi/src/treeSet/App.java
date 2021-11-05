package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person other) {
		return name.compareTo(other.name);
	}


}

public class App {

	public static void main(String[] args) {
		// 트리셋은 정렬기능 추가
		TreeSet<Person> people = new TreeSet<Person>();
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		
		numbers.add(8);
		numbers.add(1);
		numbers.add(7);
		numbers.add(3);
		
		for(var person: people) {
			System.out.println(person);
		}
		
		for(var n: numbers) {
			System.out.println(n);
		}
	}

}
