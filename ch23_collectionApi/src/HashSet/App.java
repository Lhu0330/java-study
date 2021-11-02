package HashSet;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));
		
		for(var fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
