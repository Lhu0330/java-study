package example_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// key:person객체, value: true,false(원격수업 여부)
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();

		inputMap(people1);
		displayMap(people1);

		inputMap(people2);
		displayMap(people2);

		// 트리맵은 정렬을 해야되는데 키값이 person객체가 비교할수 있는 메소드가 없음
		inputMap(people3);
		displayMap(people3);

	}

	private static void displayMap(Map<Person, Boolean> map) {
		map.forEach((k,v) -> System.out.println(k+ ":" + v));
		System.out.println();
	}

	private static void inputMap(Map<Person, Boolean> map) {
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), true);

	}
}
